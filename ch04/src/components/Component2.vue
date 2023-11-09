<script>
import {
  onBeforeMount,
  onBeforeUnmount,
  onBeforeUpdate,
  onMounted,
  onUnmounted,
  onUpdated,
  ref,
} from "vue";

export default {
  name: "Component2",
  setup() {
    const count = ref(0);
    const btnAdd = () => {
      count.value++;
    };

    onBeforeMount(() => {
      console.log("onBeforeMount...");
    });
    onMounted(() => {
      console.log("onMounted...");
    });
    onBeforeUpdate(() => {
      console.log("onBeforeUpdate...");
    });
    onUpdated(() => {
      console.log("onUpdated...");
    });
    onBeforeUnmount(() => {
      console.log("onBeforeUnmount...");
    });
    onUnmounted(() => {
      console.log("onUnmounted...");
    });

    return {
      count,
      btnAdd,
    };
  },
};
</script>

<template>
  <h3>Component2</h3>
  <p>count : {{ count }}</p>
  <button @:click="btnAdd">증가</button>
</template>

<style scoped></style>
