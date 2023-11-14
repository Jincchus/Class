import { createRouter, createWebHistory } from "vue-router";
import AxiosComponent from "../components/AxiosComponent.vue";
import JwtComponent from "../components/JwtComponent.vue";

/* router 인스턴스 생성 */
const router = createRouter({
  history: createWebHistory(),
  /* Routing 할 컴포넌트 추가 */
  routes: [
    { path: "/axios", name: "Axios", component: AxiosComponent },
    { path: "/jwt", name: "Jwt", component: JwtComponent },
  ],
});

// router 인스턴스 내보내기 -> main.js 에서 등록
export default router;
