package io.shulie.takin.web.data.dao.dictionary;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import javax.annotation.Resource;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.pamirs.takin.entity.dao.dict.TDictionaryDataMapper;
import com.pamirs.takin.entity.domain.vo.TDictionaryVo;
import org.apache.commons.collections4.CollectionUtils;
import org.springframework.stereotype.Component;

/**
 * @author 无涯
 * @date 2021/6/3 8:32 下午
 */
@Component
public class DictionaryDataDAOImpl implements DictionaryDataDAO{

    @Resource
    private TDictionaryDataMapper tDictionaryDataMapper;
    @Override
    public List<TDictionaryVo> getDictByCode(String code) {
        Map<String, Object> paramMap = Maps.newHashMap();
        paramMap.put("valueActive", "Y");
        paramMap.put("typeAlias", code);
        List<TDictionaryVo> vos = tDictionaryDataMapper.queryDictionaryList(paramMap);
        if(CollectionUtils.isEmpty(vos)) {
            return Lists.newArrayList();
        }
        return vos.stream().filter(t -> t.getTypeAlias().equals(code)).collect(Collectors.toList());
    }
}
