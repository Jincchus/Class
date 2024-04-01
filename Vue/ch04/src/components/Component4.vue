<script setup>
import { inject } from "vue";

const user1 = inject("user1");
const user2 = inject("user2");
</script>

<template>
  <h3>Component4</h3>
  <p>user1 : {{ user1.name }} / {{ user1.age }} / {{ user1.addr }}</p>
  <p>user2 : {{ user2.name }} / {{ user2.age }} / {{ user2.addr }}</p>
</template>

<style scoped></style>
