<template>
  <div class="navbar">
    <!-- 左侧导航 -->
    <div class="left-section">
      <div class="title-menu">
        <div v-if="heads.headTitleImg" class="title-img">
          <el-image
              :src="heads.headTitleImgUrl"
              fit="cover"
              :style="{
              width: heads.headTitleImgWidth,
              height: heads.headTitleImgHeight,
              borderRadius: heads.headTitleImgBorderRadius
            }"
          />
        </div>
        <div class="title-name" :style="{ color: heads.headFontColor, fontSize: heads.headFontSize }">
          {{ this.$project.projectName }}
        </div>
      </div>
    </div>

    <!-- 右侧导航 -->
    <div class="right-section">
      <div class="user-section">
        <div class="user-info" :style="{ color: heads.headUserInfoFontColor, fontSize: heads.headUserInfoFontSize }">
          <i class="fa fa-user-circle"></i> {{ this.$storage.get('role') === 'admin' ? '管理员' : '用户' }}
          {{ this.$storage.get('adminName') }}
        </div>
        <div class="function-buttons">
          <div
              class="logout-btn"
              :style="{ color: heads.headLogoutFontColor, fontSize: heads.headLogoutFontSize }"
              @mouseenter="handleHover($event, 'index')"
              @mouseleave="handleLeave($event, 'index')"
              @click="onIndexTap"
          >
            <i class="fa fa-home"></i> 返回前台
          </div>
          <div
              class="logout-btn"
              :style="{ color: heads.headLogoutFontColor, fontSize: heads.headLogoutFontSize }"
              @mouseenter="handleHover($event, 'logout')"
              @mouseleave="handleLeave($event, 'logout')"
              @click="onLogout"
          >
            <i class="fa fa-sign-out"></i> 退出登录
          </div>
        </div>
      </div>
    </div>
  </div>
</template>

<script>
export default {
  data() {
    return {
      heads: {
        headBgColor: 'var(--primary-color)',
        headHeight: '60px',
        headBoxShadow: '0 2px 8px rgba(0, 0, 0, 0.1)',
        headFontColor: 'white',
        headFontSize: '20px',
        headUserInfoFontColor: 'rgba(255, 255, 255, 0.9)',
        headUserInfoFontSize: '14px',
        headLogoutFontColor: 'white',
        headLogoutFontSize: '14px',
        headLogoutFontHoverColor: '#B0E0E6',
        headLogoutFontHoverBgColor: 'rgba(255, 255, 255, 0.1)',
        headTitleImg: true,
        headTitleImgUrl: 'http://codegen.caihongy.cn/20201021/cc7d45d9c8164b58b18351764eba9be1.jpg',
        headTitleImgWidth: '44px',
        headTitleImgHeight: '44px',
        headTitleImgBorderRadius: '22px',
        headTitleImgBoxShadow: '0 1px 6px rgba(0, 0, 0, 0.1)',
        headTitleStyle: '1'
      },
      isMobile: false
    };
  },
  mounted() {
    this.checkScreenSize();
    window.addEventListener('resize', this.checkScreenSize);
  },
  beforeDestroy() {
    window.removeEventListener('resize', this.checkScreenSize);
  },
  methods: {
    checkScreenSize() {
      this.isMobile = window.innerWidth < 768;
    },
    handleHover(event, type) {
      event.target.style.color = type === 'logout'
          ? this.heads.headLogoutFontHoverColor
          : this.heads.headUserInfoFontColor;
      event.target.style.backgroundColor = this.heads.headLogoutFontHoverBgColor;
      event.target.style.transform = 'translateY(-1px)';
    },
    handleLeave(event) {
      event.target.style.color = this.heads.headLogoutFontColor;
      event.target.style.backgroundColor = 'transparent';
      event.target.style.transform = 'translateY(0)';
    },
    onLogout() {
      this.$storage.clear();
      this.$router.replace({name: 'login'});
    },
    onIndexTap() {
      window.location.href = `${this.$base.indexUrl}`;
    }
  }
};
</script>

<style scoped>
.navbar {
  display: flex;
  justify-content: space-between;
  align-items: center;
  height: 60px;
  padding: 0 16px;
  background-color: var(--primary-color);
  box-shadow: 0 2px 8px rgba(0, 0, 0, 0.1);
}

.left-section,
.right-section {
  display: flex;
  align-items: center;
}

.title-menu {
  display: flex;
  align-items: center;
}

.title-img {
  margin-right: 10px;
}

.user-section {
  display: flex;
  align-items: center;
}

.user-info {
  margin-right: 16px;
}

.function-buttons .logout-btn {
  cursor: pointer;
  padding: 6px 12px;
  border-radius: 4px;
  transition: all 0.3s ease;
  margin-left: 8px;
  display: inline-flex;
  align-items: center;
}

.function-buttons .logout-btn i {
  margin-right: 4px;
}
</style>
