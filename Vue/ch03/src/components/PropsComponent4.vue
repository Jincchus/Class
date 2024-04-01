<script>
export default {
  name: "PropsComponent4",
  props: ["c4Name", "c4Age"],
};
</script>

<template>
  <h3>PropsComponent4</h3>
  <p>
    c4Name : {{ c4Name }}<br />
    c4Age : {{ c4Age }}<br />
  </p>
</template>

<style scoped></style>
