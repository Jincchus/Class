<script>
export default {
  name: "OptionComponent3",

  // 컴포넌트 상태값이 변하면 자동으로 계산해서 출력하는 함수 정의 옵션
  computed: {
    totPrice: function () {
      return this.price * this.count;
    },
    txtCount: function () {
      return this.text.length;
    },
    remainTxt: function () {
      return 20 - this.text.length;
    },
    computeColor: function () {
      this.mycolor = "green";

      if (this.remainTxt < 15) {
        this.mycolor = "orange";
      }
      if (this.remainTxt < 1) {
        this.mycolor = "red";
      }

      return this.mycolor;
    },
  },
  data() {
    return {
      price: 1000,
      count: 1,
      text: "",
      mycolor: "black",
    };
  },
};
</script>

<template>
  <h4>computed 옵션</h4>
  <div>
    <input type="number" v-model="price" />원
    <input type="number" v-model="count" />개
    <p>금액 :{{ totPrice }}</p>
  </div>

  <div>
    <p>20자 이내로 작성하세요.</p>
    <textarea cols="30" rows="10" v-model="text"></textarea>
    <p>글자수 :{{ txtCount }}</p>
    <p v-bind:style="{ color: computeColor }">남은 글자수 :{{ remainTxt }}</p>
  </div>
</template>

<style scoped></style>
