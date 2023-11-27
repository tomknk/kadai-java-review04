package animal;

public abstract class Animal {
        // フィールド
    private String Animalname;// 名前
    private int age;// 年齢

        // コンストラクタ
        public Animal() {
        }
        // 引数ありコンストラクタ
      public Animal(String Animalname, int age) {
        // System.out.println("初期化時に引数ありコンストラクタが呼ばれました");
          this.Animalname = Animalname;
          this.age = age;
      }
    public String getAnimalname() {
        return Animalname;
    }
    public void setAnimalname(String animalname) {
        Animalname = animalname;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    // メソッド
    // sayメソッド
    public void say() {
        System.out.println( Animalname + "です。"+ age + "歳です。");
    }
 }