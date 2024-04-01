<script>
export default {
  name: "EmitComponent1",
  props: ["name", "age"],
  data() {
    return {
      myName: this.name,
      myAge: this.age,
    };
  },
  methods: {
    btnEmit: function () {
      const emitData = {
        name: this.myName,
        age: this.myAge,
      };

      // 상위 컴포넌트로 myEmit 이벤트 발생
      this.$emit("myEmit", emitData);
    },
  },
};
</script>

<template>
  <h3>EmitComponent1</h3>
  <p>
    이름 : <input type="text" v-model="myName" /><br />
    나이 : <input type="text" v-model="myAge" /><br />
  </p>
  <button @click="btnEmit">전달</button>
</template>

<style scoped></style>
