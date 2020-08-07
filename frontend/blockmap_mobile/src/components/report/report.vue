<template>
  <div id="report" style="height: 92vh; overflow: scroll;"> <!-- 信息上报页面（这样设置保证地图的缓存） -->
    <yd-navbar :title="$t('message.epidemicreport')"> <!-- 顶部导航栏 -->
    </yd-navbar>
    <yd-cell-group :title="$t('message.basicinformation')"> <!-- 基本信息 -->
      <yd-cell-item>
        <span slot="left">{{$t("message.realname")}}：</span> <!-- 姓名： -->
        <yd-input slot="right" v-model="yourName" :readonly="true" :show-clear-icon="false" required></yd-input>
      </yd-cell-item>
      <yd-cell-item>
        <span slot="left">{{$t("message.telephone")}}：</span> <!-- 手机号码： -->
        <yd-input slot="right" v-model="phoneNumber" :readonly="true" :show-clear-icon="false" required></yd-input>
      </yd-cell-item>
      <yd-cell-item>
        <span slot="left">{{$t("message.email")}}：</span> <!-- 邮箱： -->
        <yd-input slot="right" v-model="mailBox" :readonly="true" :show-clear-icon="false" required></yd-input>
      </yd-cell-item>
      <yd-cell-item>
        <span slot="left">{{$t("message.sex")}}：</span> <!-- 性别： -->
        <yd-input slot="right" v-model="sex" :readonly="true" :show-clear-icon="false" required></yd-input>
      </yd-cell-item>
      <yd-cell-item>
        <span slot="left">{{$t("message.age")}}：</span> <!-- 年龄： -->
        <yd-input slot="right" required v-model="age" regex="[1-9][0-9]*" ref="age"></yd-input>
      </yd-cell-item>
    </yd-cell-group>
    <yd-cell-group :title="$t('message.readdress')"> <!-- 居住地址 -->
      <yd-cell-item>
        <span slot="left">{{$t("message.province")}}：</span> <!-- 省： -->
        <yd-input slot="right" v-model="province" :readonly="true" :show-clear-icon="false" required></yd-input>
      </yd-cell-item>
      <yd-cell-item>
        <span slot="left">{{$t("message.city")}}：</span> <!-- 市： -->
        <yd-input slot="right" v-model="city" :readonly="true" :show-clear-icon="false" required></yd-input>
      </yd-cell-item>
      <yd-cell-item>
        <span slot="left">{{$t("message.district")}}：</span> <!-- 区： -->
        <yd-input slot="right" v-model="district" :readonly="true" :show-clear-icon="false" required></yd-input>
      </yd-cell-item>
      <yd-cell-item>
        <span slot="left">{{$t("message.detailaddress")}}：</span> <!-- 详细地址： -->
        <yd-input slot="right" v-model="deaddress" :readonly="true" :show-clear-icon="false" required></yd-input>
      </yd-cell-item>
    </yd-cell-group>
    <yd-cell-group :title="$t('message.bodycondition')"> <!-- 健康状况 -->
      <yd-cell-item type="radio">
        <span slot="left">{{$t("message.healthy")}}</span> <!-- 健康 -->
        <input slot="right" type="radio" value="health" v-model="bodyHealth"/>
      </yd-cell-item>
      <yd-cell-item type="radio">
        <span slot="left">{{$t("message.sick")}}</span> <!-- 确诊 -->
        <input slot="right" type="radio" value="sick" v-model="bodyHealth"/>
      </yd-cell-item>
      <yd-cell-item type="radio">
        <span slot="left">{{$t("message.suspected")}}</span> <!-- 疑似 -->
        <input slot="right" type="radio" value="isolate" v-model="bodyHealth"/>
      </yd-cell-item>
    </yd-cell-group>
    <yd-cell-group :title="$t('message.sicksituation')" class="forsick" style="display: none"> <!-- 确诊情况 -->
      <yd-cell-item arrow>
        <span slot="left">{{$t("message.sickdate")}}：</span> <!-- 确诊日期 -->
        <yd-datetime v-model="sickDate" type="date" slot="right" start-date="2019-01-01" :yearFormat="$t('message.yearformat')" :month-format="$t('message.monthformat')" :day-format="$t('message.dayformat')"></yd-datetime>
      </yd-cell-item>
      <yd-cell-item>
        <yd-textarea slot="right" :placeholder="$t('message.pathpost')" v-model="pathPost"></yd-textarea>
      </yd-cell-item>
    </yd-cell-group>
    <div style="padding-right: 0.3rem; padding-left: 0.3rem; padding-bottom: 0.3rem" slot="right">
      <yd-button size="large" bgcolor="#1E90FF" color="#FFF" @click.native="submitReport">{{$t("message.submit")}}</yd-button> <!-- 提交 -->
    </div>
    <yd-button shape="angle" size="small" bgcolor="#C0C0C0" @click.native="backToHome" class="back">
      <img src="../../assets/back.png" alt="no resource" width="24" height="24"/>
    </yd-button> <!-- 返回按钮 #2db7f5 -->
  </div>
</template>

<script>
export default {
  name: 'report',
  data () { // 数据
    return {
      yourName: '卫晓欣', // 姓名
      phoneNumber: '', // 手机号（可以添加验证）
      mailBox: '0123456789@qq.com', // 邮箱（可以添加验证）
      sex: '', // 性别
      age: '', // 年龄
      province: '', // 省
      city: '', // 市
      district: '', // 区
      deaddress: '', // 详细地址
      bodyHealth: 'health', // 身体健康状况
      sickDate: '', // 确诊日期
      pathPost: '' // 确诊前去过的地方
    }
  },
  methods: { // 方法
    backToHome () { // 返回地图主页
      this.$router.push('/home')
    },
    submitReport () { // 信息上报
      let badtip = ''
      if (!this.$refs.age.valid) {
        badtip += '年龄填写错误！'
      }
      this.showTips(badtip, 'error')
      // this.showTips('提交成功', 'success')
    },
    showTips (tip, type) { // 显示提示信息（tip为提示内容，type为success、error、或没有图标）
      this.$dialog.toast({ // 显示上传成功框（上传成功）
        mes: tip,
        timeout: 1000,
        icon: type
      })
    }
  },
  watch: { // 监听变化
    bodyHealth (newVal, oldVal) { // 健康状况选确诊时确诊详细情况填写才出现
      if (newVal === 'sick') {
        let item = document.getElementsByClassName('forsick')[0]
        item.style.display = 'inline'
      } else {
        if (oldVal === 'sick') {
          let item = document.getElementsByClassName('forsick')[0]
          item.style.display = 'none'
        }
      }
    }
  }
}
</script>

<style scoped>
/*
#report{
width: 100%;
height: 100%;
}
*/
.back{ /*返回按钮*/
  position: absolute;
  z-index: 99; /*在最高层*/
  opacity: 0.5; /*设置透明度*/
  top: 1.5rem; /*离手机顶部的距离*/
}
</style>
