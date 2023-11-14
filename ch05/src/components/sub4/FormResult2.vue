<script setup>
import { reactive } from "vue";
import { useRoute } from "vue-router";

// router 인스턴스 가져오기
const route = useRoute();

// router query 데이터 수신
const user = route.params;
</script>

<template>
  <h4>FormResult2</h4>

  <p v-bind="hellovind">
    name : {{ user.name }}<br />
    age : {{ user.age }}<br />
    addr : {{ user.addr }}<br />
  </p>
</template>

<style scoped></style>
