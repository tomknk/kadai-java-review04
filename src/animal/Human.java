package animal;

class Human extends Animal implements Thinkable {

        private String hobby;// 趣味

        // getter
        public String getHobby() {
            return hobby;
        }
        // setter
        public void setHobby(String hobby) {
            this.hobby = hobby;
        }
        // 引数なしのコンストラクタ
        public Human() {
        }
        // 引数ありコンストラクタ
        public Human(String Animalname, int age,String hobby) {
          super.setAnimalname(Animalname);
          super.setAge(age);
          this.hobby = hobby;
        }

        //メソッド
        @Override
        // thinkメソッド
        public void think() {
            System.out.println("私は" + hobby + "について考えています。");
        }
}
