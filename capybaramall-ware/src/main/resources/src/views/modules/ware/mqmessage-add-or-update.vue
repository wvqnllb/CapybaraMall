<template>
  <el-dialog
    :title="!dataForm.id ? '新增' : '修改'"
    :close-on-click-modal="false"
    :visible.sync="visible">
    <el-form :model="dataForm" :rules="dataRule" ref="dataForm" @keyup.enter.native="dataFormSubmit()" label-width="80px">
    <el-form-item label="消息id" prop="messageId">
      <el-input v-model="dataForm.messageId" placeholder="消息id"></el-input>
    </el-form-item>
    <el-form-item label="json数据" prop="content">
      <el-input v-model="dataForm.content" placeholder="json数据"></el-input>
    </el-form-item>
    <el-form-item label="发送到哪个交换机" prop="toExchane">
      <el-input v-model="dataForm.toExchane" placeholder="发送到哪个交换机"></el-input>
    </el-form-item>
    <el-form-item label="路由键" prop="routingKey">
      <el-input v-model="dataForm.routingKey" placeholder="路由键"></el-input>
    </el-form-item>
    <el-form-item label="发送数据的类型" prop="classType">
      <el-input v-model="dataForm.classType" placeholder="发送数据的类型"></el-input>
    </el-form-item>
    <el-form-item label="0-已抵达 1-错误抵达" prop="messageStatus">
      <el-input v-model="dataForm.messageStatus" placeholder="0-已抵达 1-错误抵达"></el-input>
    </el-form-item>
    <el-form-item label="创建时间" prop="createTime">
      <el-input v-model="dataForm.createTime" placeholder="创建时间"></el-input>
    </el-form-item>
    <el-form-item label="更新时间" prop="updateTime">
      <el-input v-model="dataForm.updateTime" placeholder="更新时间"></el-input>
    </el-form-item>
    </el-form>
    <span slot="footer" class="dialog-footer">
      <el-button @click="visible = false">取消</el-button>
      <el-button type="primary" @click="dataFormSubmit()">确定</el-button>
    </span>
  </el-dialog>
</template>

<script>
  export default {
    data () {
      return {
        visible: false,
        dataForm: {
          id: 0,
          messageId: '',
          content: '',
          toExchane: '',
          routingKey: '',
          classType: '',
          messageStatus: '',
          createTime: '',
          updateTime: ''
        },
        dataRule: {
          messageId: [
            { required: true, message: '消息id不能为空', trigger: 'blur' }
          ],
          content: [
            { required: true, message: 'json数据不能为空', trigger: 'blur' }
          ],
          toExchane: [
            { required: true, message: '发送到哪个交换机不能为空', trigger: 'blur' }
          ],
          routingKey: [
            { required: true, message: '路由键不能为空', trigger: 'blur' }
          ],
          classType: [
            { required: true, message: '发送数据的类型不能为空', trigger: 'blur' }
          ],
          messageStatus: [
            { required: true, message: '0-已抵达 1-错误抵达不能为空', trigger: 'blur' }
          ],
          createTime: [
            { required: true, message: '创建时间不能为空', trigger: 'blur' }
          ],
          updateTime: [
            { required: true, message: '更新时间不能为空', trigger: 'blur' }
          ]
        }
      }
    },
    methods: {
      init (id) {
        this.dataForm.id = id || 0
        this.visible = true
        this.$nextTick(() => {
          this.$refs['dataForm'].resetFields()
          if (this.dataForm.id) {
            this.$http({
              url: this.$http.adornUrl(`/ware/mqmessage/info/${this.dataForm.id}`),
              method: 'get',
              params: this.$http.adornParams()
            }).then(({data}) => {
              if (data && data.code === 0) {
                this.dataForm.messageId = data.mqMessage.messageId
                this.dataForm.content = data.mqMessage.content
                this.dataForm.toExchane = data.mqMessage.toExchane
                this.dataForm.routingKey = data.mqMessage.routingKey
                this.dataForm.classType = data.mqMessage.classType
                this.dataForm.messageStatus = data.mqMessage.messageStatus
                this.dataForm.createTime = data.mqMessage.createTime
                this.dataForm.updateTime = data.mqMessage.updateTime
              }
            })
          }
        })
      },
      // 表单提交
      dataFormSubmit () {
        this.$refs['dataForm'].validate((valid) => {
          if (valid) {
            this.$http({
              url: this.$http.adornUrl(`/ware/mqmessage/${!this.dataForm.id ? 'save' : 'update'}`),
              method: 'post',
              data: this.$http.adornData({
                'id': this.dataForm.id || undefined,
                'messageId': this.dataForm.messageId,
                'content': this.dataForm.content,
                'toExchane': this.dataForm.toExchane,
                'routingKey': this.dataForm.routingKey,
                'classType': this.dataForm.classType,
                'messageStatus': this.dataForm.messageStatus,
                'createTime': this.dataForm.createTime,
                'updateTime': this.dataForm.updateTime
              })
            }).then(({data}) => {
              if (data && data.code === 0) {
                this.$message({
                  message: '操作成功',
                  type: 'success',
                  duration: 1500,
                  onClose: () => {
                    this.visible = false
                    this.$emit('refreshDataList')
                  }
                })
              } else {
                this.$message.error(data.msg)
              }
            })
          }
        })
      }
    }
  }
</script>
