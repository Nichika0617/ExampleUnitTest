package jp.ac.uryukyu.ie.e195765;

public class LivingThing {
    String name;
    int hitPoint;
    int attack;
    boolean dead;

    /**
     *
     * @param name Hero,enemyの名前
     * @param maximumHP　Hero,enemyのHP
     * @param attack　Hero,enemyの攻撃力
     */

    public LivingThing(String name, int maximumHP, int attack){
        dead = false;
        this.name = name;
        this.hitPoint = maximumHP;
        this.attack = attack;
    }
    /**
     * @return boolean
     */
    public boolean isDead(){
        return dead;
    }

    public String getName(){
        return name;
    }
    /**
     * 攻撃するメソッド。
     * attackに応じて乱数でダメージを算出し、name.wounded()によりダメージ処理を実行。
     * @param opponent 攻撃対象
     */
    public void attack(LivingThing opponent) {
        if (dead == false) {
            int damage = (int) (Math.random() * attack);
            System.out.printf("%sの攻撃！%sに%dのダメージを与えた！！\n", name, opponent.getName(), damage);
            opponent.wounded(damage);
        }
    }

    public void wounded(int damage){
        hitPoint -= damage;
        if( hitPoint < 0 ) {
            dead = true;
            System.out.printf("%sは倒れた。\n", name);
        }

    }



}

