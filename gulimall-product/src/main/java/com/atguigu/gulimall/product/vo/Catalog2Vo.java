package com.atguigu.gulimall.product.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Catalog2Vo {
    private String catalogId;
    private List<Catalog3Vo> catalog3List;
    private String id;
    String name;

    @NoArgsConstructor
    @AllArgsConstructor
    @Data
    public static class Catalog3Vo {
        private String catalog2Id;
        private String id;
        private String name;

        public String getCatalog2Id() {
            return catalog2Id;
        }

        public String getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        public void setCatalog2Id(String catalog2Id) {
            this.catalog2Id = catalog2Id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    public String getCatalogId() {
        return catalogId;
    }

    public List<Catalog3Vo> getCatalog3List() {
        return catalog3List;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setCatalogId(String catalogId) {
        this.catalogId = catalogId;
    }

    public void setCatalog3List(List<Catalog3Vo> catalog3List) {
        this.catalog3List = catalog3List;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
}
