package strategyPattern;

import strategyPattern.behavior.AttackTT;
import strategyPattern.behavior.DefendTBS;
import strategyPattern.behavior.DisplayGDS;
import strategyPattern.behavior.RunJCTQ;

/**
 * Created by 59177 on 2017/12/18.
 * http://blog.csdn.net/lmj623565791/article/details/24116745
 */
public class TestRole {

    public static void main(String[] args) {
        Role roleA=new RoleA("猪八戒");

        roleA.setAttackBehavior(new AttackTT() );
        roleA.setDefendBehavior(new DefendTBS() );
        roleA.setDisplayBehavior(new DisplayGDS() );
        roleA.setRunBehavior(new RunJCTQ() );

        System.out.println(roleA.name + ":");
        roleA.run();
        roleA.attack();
        roleA.defend();
        roleA.display();


    }
}

//        1、封装变化（把可能变化的代码封装起来）
//
//        2、多用组合，少用继承（我们使用组合的方式，为客户设置了算法）
//
//        3、针对接口编程，不针对实现（对于Role类的设计完全的针对角色，和技能的实现没有关系）
