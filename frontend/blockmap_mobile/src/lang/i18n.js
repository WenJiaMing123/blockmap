import Vue from 'vue'
import VueI18n from 'vue-i18n' // 导入国际化库vue-i18n

Vue.use(VueI18n) // 引用vue-i18n

export const i18n = new VueI18n({
  locale: sessionStorage.getItem('locale') || 'zh', // 不会刷新丢失
  messages: {
    'zh': require('./zh'),
    'en': require('./en')
  }
})
