package lin.app.school.score.mapper;

import tk.mybatis.mapper.common.*;

public interface MyMapper<T> extends Mapper<T>, ExampleMapper<T>, MySqlMapper<T>, RowBoundsMapper<T>, SqlServerMapper<T>, IdsMapper<T>, ConditionMapper<T> {
}
