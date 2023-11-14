<script setup>
import { reactive } from "vue";
import { useRoute } from "vue-router"; // 수신시 route

// router 인스턴스 가져오기
const route = useRoute();

// router query 데이터 수신
const user = route.query;
</script>

<template>
  <h4>FormResult1</h4>

  <p v-bind="hellovind">
    name : {{ user.name }}<br />
    age : {{ user.age }}<br />
    addr : {{ user.addr }}<br />
  </p>
</template>

<style scoped></style>
