Orderd JUnit
============


Description
-----------

JUnitでテストメソッドの実行順序を指定できます

Usage
-----

Write like this on your JUnit test case:

    @RunWith(OrderedRunner.class)
    public class TestUseOdered {
        @Test
        @Order(Priority.LOW)
        public void tailTest(){
            System.out.println("tail");
        }


        @Test
        @Order(Priority.NORMAL)
        public void normalTest(){
            System.out.println("normal");
        }

        @Test
        @Order(Priority.HIGH)
        public void headTest(){
            System.out.println("head");
        }
    }


TODO
----

+ クラス内のメソッドのみを対象としているため，クラスの順序等も優先度つけられるようにする
+ テスト書く
+ Nexusに上げる