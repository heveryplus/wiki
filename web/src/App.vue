<template>
  <!--整个页面的框架-->
  <a-layout>
    <!-- 不变的部分写在app.vue:包括header和footer -->
    <!-- 引入自定义组件the-header -->
    <the-header></the-header>
    <!--变化的部分写在router-view-->
    <router-view/>
    <the-footer></the-footer>
  </a-layout>
</template>

<script lang="ts">
  import { UserOutlined, LaptopOutlined, NotificationOutlined } from '@ant-design/icons-vue';
  import { defineComponent, ref } from 'vue';
  import TheHeader from '@/components/the-header.vue';
  import TheFooter from '@/components/the-footer.vue';

  export default defineComponent({
    name:"app",
    components: {
      UserOutlined,
      LaptopOutlined,
      NotificationOutlined,
      TheHeader,
      TheFooter
    },
    setup() {
      return {
        selectedKeys1: ref<string[]>(['2']),
        selectedKeys2: ref<string[]>(['1']),
        collapsed: ref<boolean>(false),
        openKeys: ref<string[]>(['sub1']),
      };
    },
  });

</script>

<style>
#components-layout-demo-top-side-2 .logo {
  float: left;
  width: 120px;
  height: 31px;
  margin: 16px 24px 16px 0;
  background: rgba(255, 255, 255, 0.3);
}

.ant-row-rtl #components-layout-demo-top-side-2 .logo {
  float: right;
  margin: 16px 0 16px 24px;
}

.site-layout-background {
  background: #fff;
}
</style>
