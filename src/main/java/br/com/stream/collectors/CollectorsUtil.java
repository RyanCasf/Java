package br.com.stream.collectors;

import java.util.List;
import java.util.stream.Collectors;

public class CollectorsUtil {

    private List<String> list;

    public String getStringIds() {
        if (list == null || list.isEmpty()) {
            return null;
        }

        return list.stream().map(response -> (String) response)
                .collect(Collectors.joining(","));
    }

    public void setList(List<String> list) {
        this.list = list;
    }
}