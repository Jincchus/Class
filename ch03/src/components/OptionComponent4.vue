<script>
export default {
  name: "OptionComponent4",
  watch: {
    inputTxt: function () {
      const pos = this.inputTxt.indexOf(this.forbiddenTxt);

      if (pos >= 0) {
        alert(this.forbiddenTxt + "는 입력이 불가능한 단어 입니다");
        this.inputTxt = this.inputTxt.substring(0, pos);
      }
    },
  },
  data() {
    return {
      forbiddenTxt: "바보",
      inputTxt: "",
    };
  },
};
</script>

<template>
  <h4>watch 옵션</h4>
  <div>
    <p>금지어 발견 : {{ forbiddenTxt }}</p>
    <textarea v-model="inputTxt" cols="30" rows="10"></textarea>
  </div>
</template>

<style scoped></style>
