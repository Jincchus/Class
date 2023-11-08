<script>
import PropsComponent4 from "./PropsComponent4.vue";

export default {
  name: "PropsComponent3",
  props: ["c3Name", "c3Age"],
  components: { PropsComponent4 },
};
</script>

<template>
  <h3>PropsComponent3</h3>
  <p>
    c3Name : {{ c3Name }}<br />
    c3Age : {{ c3Age }}<br />
  </p>

  <PropsComponent4 :c4Name="c3Name" :c4Age="c3Age" />
</template>

<style scoped></style>
