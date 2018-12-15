package com.base.model;

import java.util.ArrayList;
import java.util.List;

public class RoleMenuRelationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RoleMenuRelationExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andUuidIsNull() {
            addCriterion("uuid is null");
            return (Criteria) this;
        }

        public Criteria andUuidIsNotNull() {
            addCriterion("uuid is not null");
            return (Criteria) this;
        }

        public Criteria andUuidEqualTo(String value) {
            addCriterion("uuid =", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidNotEqualTo(String value) {
            addCriterion("uuid <>", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidGreaterThan(String value) {
            addCriterion("uuid >", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidGreaterThanOrEqualTo(String value) {
            addCriterion("uuid >=", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidLessThan(String value) {
            addCriterion("uuid <", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidLessThanOrEqualTo(String value) {
            addCriterion("uuid <=", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidLike(String value) {
            addCriterion("uuid like", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidNotLike(String value) {
            addCriterion("uuid not like", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidIn(List<String> values) {
            addCriterion("uuid in", values, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidNotIn(List<String> values) {
            addCriterion("uuid not in", values, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidBetween(String value1, String value2) {
            addCriterion("uuid between", value1, value2, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidNotBetween(String value1, String value2) {
            addCriterion("uuid not between", value1, value2, "uuid");
            return (Criteria) this;
        }

        public Criteria andRUuidIsNull() {
            addCriterion("r_uuid is null");
            return (Criteria) this;
        }

        public Criteria andRUuidIsNotNull() {
            addCriterion("r_uuid is not null");
            return (Criteria) this;
        }

        public Criteria andRUuidEqualTo(String value) {
            addCriterion("r_uuid =", value, "rUuid");
            return (Criteria) this;
        }

        public Criteria andRUuidNotEqualTo(String value) {
            addCriterion("r_uuid <>", value, "rUuid");
            return (Criteria) this;
        }

        public Criteria andRUuidGreaterThan(String value) {
            addCriterion("r_uuid >", value, "rUuid");
            return (Criteria) this;
        }

        public Criteria andRUuidGreaterThanOrEqualTo(String value) {
            addCriterion("r_uuid >=", value, "rUuid");
            return (Criteria) this;
        }

        public Criteria andRUuidLessThan(String value) {
            addCriterion("r_uuid <", value, "rUuid");
            return (Criteria) this;
        }

        public Criteria andRUuidLessThanOrEqualTo(String value) {
            addCriterion("r_uuid <=", value, "rUuid");
            return (Criteria) this;
        }

        public Criteria andRUuidLike(String value) {
            addCriterion("r_uuid like", value, "rUuid");
            return (Criteria) this;
        }

        public Criteria andRUuidNotLike(String value) {
            addCriterion("r_uuid not like", value, "rUuid");
            return (Criteria) this;
        }

        public Criteria andRUuidIn(List<String> values) {
            addCriterion("r_uuid in", values, "rUuid");
            return (Criteria) this;
        }

        public Criteria andRUuidNotIn(List<String> values) {
            addCriterion("r_uuid not in", values, "rUuid");
            return (Criteria) this;
        }

        public Criteria andRUuidBetween(String value1, String value2) {
            addCriterion("r_uuid between", value1, value2, "rUuid");
            return (Criteria) this;
        }

        public Criteria andRUuidNotBetween(String value1, String value2) {
            addCriterion("r_uuid not between", value1, value2, "rUuid");
            return (Criteria) this;
        }

        public Criteria andMUuidIsNull() {
            addCriterion("m_uuid is null");
            return (Criteria) this;
        }

        public Criteria andMUuidIsNotNull() {
            addCriterion("m_uuid is not null");
            return (Criteria) this;
        }

        public Criteria andMUuidEqualTo(String value) {
            addCriterion("m_uuid =", value, "mUuid");
            return (Criteria) this;
        }

        public Criteria andMUuidNotEqualTo(String value) {
            addCriterion("m_uuid <>", value, "mUuid");
            return (Criteria) this;
        }

        public Criteria andMUuidGreaterThan(String value) {
            addCriterion("m_uuid >", value, "mUuid");
            return (Criteria) this;
        }

        public Criteria andMUuidGreaterThanOrEqualTo(String value) {
            addCriterion("m_uuid >=", value, "mUuid");
            return (Criteria) this;
        }

        public Criteria andMUuidLessThan(String value) {
            addCriterion("m_uuid <", value, "mUuid");
            return (Criteria) this;
        }

        public Criteria andMUuidLessThanOrEqualTo(String value) {
            addCriterion("m_uuid <=", value, "mUuid");
            return (Criteria) this;
        }

        public Criteria andMUuidLike(String value) {
            addCriterion("m_uuid like", value, "mUuid");
            return (Criteria) this;
        }

        public Criteria andMUuidNotLike(String value) {
            addCriterion("m_uuid not like", value, "mUuid");
            return (Criteria) this;
        }

        public Criteria andMUuidIn(List<String> values) {
            addCriterion("m_uuid in", values, "mUuid");
            return (Criteria) this;
        }

        public Criteria andMUuidNotIn(List<String> values) {
            addCriterion("m_uuid not in", values, "mUuid");
            return (Criteria) this;
        }

        public Criteria andMUuidBetween(String value1, String value2) {
            addCriterion("m_uuid between", value1, value2, "mUuid");
            return (Criteria) this;
        }

        public Criteria andMUuidNotBetween(String value1, String value2) {
            addCriterion("m_uuid not between", value1, value2, "mUuid");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}