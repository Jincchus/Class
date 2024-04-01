<script>
export default {
  name: "PropsComponent1",
  props: ["name", "age"],
};
</script>

<template>
  <h3>PropsComponent1</h3>
  <p>
    props name : {{ name }}<br />
    props age : {{ age }}<br />
  </p>
</template>

<style scoped></style>
