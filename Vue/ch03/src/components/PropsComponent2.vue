<script>
export default {
  name: "PropsComponent2",
  props: ["myCity"],
};
</script>

<template>
  <li>{{ myCity }}</li>
</template>

<style scoped></style>
