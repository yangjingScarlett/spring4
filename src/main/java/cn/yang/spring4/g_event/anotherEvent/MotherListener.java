package cn.yang.spring4.g_event.anotherEvent;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * 上海万达小额贷款有限公司
 * Created by 杨静 on 2017/11/24
 */
@Component
public class MotherListener implements ApplicationListener<AnExamination> {

    public void onApplicationEvent(AnExamination anExamination) {

        String name = anExamination.getName();
        int score = Integer.parseInt(anExamination.getScore());

        if (score < 60) {
            System.out.println(name + "考试不及格，罚你洗碗一个月！");
        } else if (score < 70) {
            System.out.println(name + "考试及格了，但没到70分，不惩罚也不奖励！");
        } else if (score < 80) {
            System.out.println(name + "考试终于上了70分了，虽然没到80，但是小小奖励一下，晚上做好吃的给你！");
        } else if (score < 90) {
            System.out.println(name + "考试上了80分，这可是个大大的进步，要奖励你，这周末带你去买衣服！");
        } else if (score < 100) {
            System.out.println("你太棒了，" + name + "考试上了90分呢，大大奖励你，周末带你去迪士尼玩！");
        } else if (score == 100) {
            System.out.println("天哪，你" + name + "居然考了满分，妈妈太开心了，未来一个月你想要什么妈妈都给你！");
        }
    }

}
