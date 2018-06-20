package lin.app.test;

import lin.app.school.score.dao.ClassMapper;
import lin.app.school.score.domain.Class;
import org.apache.ibatis.session.RowBounds;

import java.util.List;

public class TestMain {
    public static void main(String[] args) {
        ClassMapper mapper=new ClassMapper() {
            @Override
            public int deleteByPrimaryKey(Object o) {
                return 0;
            }

            @Override
            public int delete(Class aClass) {
                return 0;
            }

            @Override
            public int insert(Class aClass) {
                return 0;
            }

            @Override
            public int insertSelective(Class aClass) {
                return 0;
            }

            @Override
            public boolean existsWithPrimaryKey(Object o) {
                return false;
            }

            @Override
            public List<Class> selectAll() {
                return null;
            }

            @Override
            public Class selectByPrimaryKey(Object o) {
                return null;
            }

            @Override
            public int selectCount(Class aClass) {
                return 0;
            }

            @Override
            public List<Class> select(Class aClass) {
                return null;
            }

            @Override
            public Class selectOne(Class aClass) {
                return null;
            }

            @Override
            public int updateByPrimaryKey(Class aClass) {
                return 0;
            }

            @Override
            public int updateByPrimaryKeySelective(Class aClass) {
                return 0;
            }

            @Override
            public int deleteByCondition(Object o) {
                return 0;
            }

            @Override
            public List<Class> selectByCondition(Object o) {
                return null;
            }

            @Override
            public int selectCountByCondition(Object o) {
                return 0;
            }

            @Override
            public int updateByCondition(Class aClass, Object o) {
                return 0;
            }

            @Override
            public int updateByConditionSelective(Class aClass, Object o) {
                return 0;
            }

            @Override
            public int deleteByExample(Object o) {
                return 0;
            }

            @Override
            public List<Class> selectByExample(Object o) {
                return null;
            }

            @Override
            public int selectCountByExample(Object o) {
                return 0;
            }

            @Override
            public Class selectOneByExample(Object o) {
                return null;
            }

            @Override
            public int updateByExample(Class aClass, Object o) {
                return 0;
            }

            @Override
            public int updateByExampleSelective(Class aClass, Object o) {
                return 0;
            }

            @Override
            public int deleteByIds(String s) {
                return 0;
            }

            @Override
            public List<Class> selectByIds(String s) {
                return null;
            }

            @Override
            public List<Class> selectByExampleAndRowBounds(Object o, RowBounds rowBounds) {
                return null;
            }

            @Override
            public List<Class> selectByRowBounds(Class aClass, RowBounds rowBounds) {
                return null;
            }

            @Override
            public int insertList(List<Class> list) {
                return 0;
            }

            @Override
            public int insertUseGeneratedKeys(Class aClass) {
                return 0;
            }
        };
    }
}
