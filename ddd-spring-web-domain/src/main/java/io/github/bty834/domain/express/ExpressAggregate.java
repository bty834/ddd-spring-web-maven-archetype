package io.github.bty834.domain.express;

import io.github.bty834.domain.enums.ExpressStatus;
import io.github.bty834.domain.vo.ExpressNumber;
import java.util.List;
import java.util.Objects;
import lombok.Data;

@Data
public class ExpressAggregate {
    // 物流编号
    private ExpressNumber expressNumber;

    private List<Goods> goodsList;
    private ExpressStatus expressStatus;


    /**
     * 判断是否发货
     * @return
     */
    public boolean hasSent() {
        return Objects.equals(this.expressStatus, ExpressStatus.SENT)
                   || Objects.equals(this.expressStatus, ExpressStatus.RECEIVED)
                   || Objects.equals(this.expressStatus, ExpressStatus.RETURN);
    }
}
