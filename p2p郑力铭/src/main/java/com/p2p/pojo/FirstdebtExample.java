package com.p2p.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class FirstdebtExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FirstdebtExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andDebttitleIsNull() {
            addCriterion("debttitle is null");
            return (Criteria) this;
        }

        public Criteria andDebttitleIsNotNull() {
            addCriterion("debttitle is not null");
            return (Criteria) this;
        }

        public Criteria andDebttitleEqualTo(String value) {
            addCriterion("debttitle =", value, "debttitle");
            return (Criteria) this;
        }

        public Criteria andDebttitleNotEqualTo(String value) {
            addCriterion("debttitle <>", value, "debttitle");
            return (Criteria) this;
        }

        public Criteria andDebttitleGreaterThan(String value) {
            addCriterion("debttitle >", value, "debttitle");
            return (Criteria) this;
        }

        public Criteria andDebttitleGreaterThanOrEqualTo(String value) {
            addCriterion("debttitle >=", value, "debttitle");
            return (Criteria) this;
        }

        public Criteria andDebttitleLessThan(String value) {
            addCriterion("debttitle <", value, "debttitle");
            return (Criteria) this;
        }

        public Criteria andDebttitleLessThanOrEqualTo(String value) {
            addCriterion("debttitle <=", value, "debttitle");
            return (Criteria) this;
        }

        public Criteria andDebttitleLike(String value) {
            addCriterion("debttitle like", value, "debttitle");
            return (Criteria) this;
        }

        public Criteria andDebttitleNotLike(String value) {
            addCriterion("debttitle not like", value, "debttitle");
            return (Criteria) this;
        }

        public Criteria andDebttitleIn(List<String> values) {
            addCriterion("debttitle in", values, "debttitle");
            return (Criteria) this;
        }

        public Criteria andDebttitleNotIn(List<String> values) {
            addCriterion("debttitle not in", values, "debttitle");
            return (Criteria) this;
        }

        public Criteria andDebttitleBetween(String value1, String value2) {
            addCriterion("debttitle between", value1, value2, "debttitle");
            return (Criteria) this;
        }

        public Criteria andDebttitleNotBetween(String value1, String value2) {
            addCriterion("debttitle not between", value1, value2, "debttitle");
            return (Criteria) this;
        }

        public Criteria andDebtorIsNull() {
            addCriterion("debtor is null");
            return (Criteria) this;
        }

        public Criteria andDebtorIsNotNull() {
            addCriterion("debtor is not null");
            return (Criteria) this;
        }

        public Criteria andDebtorEqualTo(String value) {
            addCriterion("debtor =", value, "debtor");
            return (Criteria) this;
        }

        public Criteria andDebtorNotEqualTo(String value) {
            addCriterion("debtor <>", value, "debtor");
            return (Criteria) this;
        }

        public Criteria andDebtorGreaterThan(String value) {
            addCriterion("debtor >", value, "debtor");
            return (Criteria) this;
        }

        public Criteria andDebtorGreaterThanOrEqualTo(String value) {
            addCriterion("debtor >=", value, "debtor");
            return (Criteria) this;
        }

        public Criteria andDebtorLessThan(String value) {
            addCriterion("debtor <", value, "debtor");
            return (Criteria) this;
        }

        public Criteria andDebtorLessThanOrEqualTo(String value) {
            addCriterion("debtor <=", value, "debtor");
            return (Criteria) this;
        }

        public Criteria andDebtorLike(String value) {
            addCriterion("debtor like", value, "debtor");
            return (Criteria) this;
        }

        public Criteria andDebtorNotLike(String value) {
            addCriterion("debtor not like", value, "debtor");
            return (Criteria) this;
        }

        public Criteria andDebtorIn(List<String> values) {
            addCriterion("debtor in", values, "debtor");
            return (Criteria) this;
        }

        public Criteria andDebtorNotIn(List<String> values) {
            addCriterion("debtor not in", values, "debtor");
            return (Criteria) this;
        }

        public Criteria andDebtorBetween(String value1, String value2) {
            addCriterion("debtor between", value1, value2, "debtor");
            return (Criteria) this;
        }

        public Criteria andDebtorNotBetween(String value1, String value2) {
            addCriterion("debtor not between", value1, value2, "debtor");
            return (Criteria) this;
        }

        public Criteria andLastrepaydateIsNull() {
            addCriterion("lastrepaydate is null");
            return (Criteria) this;
        }

        public Criteria andLastrepaydateIsNotNull() {
            addCriterion("lastrepaydate is not null");
            return (Criteria) this;
        }

        public Criteria andLastrepaydateEqualTo(Date value) {
            addCriterionForJDBCDate("lastrepaydate =", value, "lastrepaydate");
            return (Criteria) this;
        }

        public Criteria andLastrepaydateNotEqualTo(Date value) {
            addCriterionForJDBCDate("lastrepaydate <>", value, "lastrepaydate");
            return (Criteria) this;
        }

        public Criteria andLastrepaydateGreaterThan(Date value) {
            addCriterionForJDBCDate("lastrepaydate >", value, "lastrepaydate");
            return (Criteria) this;
        }

        public Criteria andLastrepaydateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("lastrepaydate >=", value, "lastrepaydate");
            return (Criteria) this;
        }

        public Criteria andLastrepaydateLessThan(Date value) {
            addCriterionForJDBCDate("lastrepaydate <", value, "lastrepaydate");
            return (Criteria) this;
        }

        public Criteria andLastrepaydateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("lastrepaydate <=", value, "lastrepaydate");
            return (Criteria) this;
        }

        public Criteria andLastrepaydateIn(List<Date> values) {
            addCriterionForJDBCDate("lastrepaydate in", values, "lastrepaydate");
            return (Criteria) this;
        }

        public Criteria andLastrepaydateNotIn(List<Date> values) {
            addCriterionForJDBCDate("lastrepaydate not in", values, "lastrepaydate");
            return (Criteria) this;
        }

        public Criteria andLastrepaydateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("lastrepaydate between", value1, value2, "lastrepaydate");
            return (Criteria) this;
        }

        public Criteria andLastrepaydateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("lastrepaydate not between", value1, value2, "lastrepaydate");
            return (Criteria) this;
        }

        public Criteria andNowrepaydateIsNull() {
            addCriterion("nowrepaydate is null");
            return (Criteria) this;
        }

        public Criteria andNowrepaydateIsNotNull() {
            addCriterion("nowrepaydate is not null");
            return (Criteria) this;
        }

        public Criteria andNowrepaydateEqualTo(Date value) {
            addCriterionForJDBCDate("nowrepaydate =", value, "nowrepaydate");
            return (Criteria) this;
        }

        public Criteria andNowrepaydateNotEqualTo(Date value) {
            addCriterionForJDBCDate("nowrepaydate <>", value, "nowrepaydate");
            return (Criteria) this;
        }

        public Criteria andNowrepaydateGreaterThan(Date value) {
            addCriterionForJDBCDate("nowrepaydate >", value, "nowrepaydate");
            return (Criteria) this;
        }

        public Criteria andNowrepaydateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("nowrepaydate >=", value, "nowrepaydate");
            return (Criteria) this;
        }

        public Criteria andNowrepaydateLessThan(Date value) {
            addCriterionForJDBCDate("nowrepaydate <", value, "nowrepaydate");
            return (Criteria) this;
        }

        public Criteria andNowrepaydateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("nowrepaydate <=", value, "nowrepaydate");
            return (Criteria) this;
        }

        public Criteria andNowrepaydateIn(List<Date> values) {
            addCriterionForJDBCDate("nowrepaydate in", values, "nowrepaydate");
            return (Criteria) this;
        }

        public Criteria andNowrepaydateNotIn(List<Date> values) {
            addCriterionForJDBCDate("nowrepaydate not in", values, "nowrepaydate");
            return (Criteria) this;
        }

        public Criteria andNowrepaydateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("nowrepaydate between", value1, value2, "nowrepaydate");
            return (Criteria) this;
        }

        public Criteria andNowrepaydateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("nowrepaydate not between", value1, value2, "nowrepaydate");
            return (Criteria) this;
        }

        public Criteria andNextrepaydateIsNull() {
            addCriterion("nextrepaydate is null");
            return (Criteria) this;
        }

        public Criteria andNextrepaydateIsNotNull() {
            addCriterion("nextrepaydate is not null");
            return (Criteria) this;
        }

        public Criteria andNextrepaydateEqualTo(Date value) {
            addCriterionForJDBCDate("nextrepaydate =", value, "nextrepaydate");
            return (Criteria) this;
        }

        public Criteria andNextrepaydateNotEqualTo(Date value) {
            addCriterionForJDBCDate("nextrepaydate <>", value, "nextrepaydate");
            return (Criteria) this;
        }

        public Criteria andNextrepaydateGreaterThan(Date value) {
            addCriterionForJDBCDate("nextrepaydate >", value, "nextrepaydate");
            return (Criteria) this;
        }

        public Criteria andNextrepaydateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("nextrepaydate >=", value, "nextrepaydate");
            return (Criteria) this;
        }

        public Criteria andNextrepaydateLessThan(Date value) {
            addCriterionForJDBCDate("nextrepaydate <", value, "nextrepaydate");
            return (Criteria) this;
        }

        public Criteria andNextrepaydateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("nextrepaydate <=", value, "nextrepaydate");
            return (Criteria) this;
        }

        public Criteria andNextrepaydateIn(List<Date> values) {
            addCriterionForJDBCDate("nextrepaydate in", values, "nextrepaydate");
            return (Criteria) this;
        }

        public Criteria andNextrepaydateNotIn(List<Date> values) {
            addCriterionForJDBCDate("nextrepaydate not in", values, "nextrepaydate");
            return (Criteria) this;
        }

        public Criteria andNextrepaydateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("nextrepaydate between", value1, value2, "nextrepaydate");
            return (Criteria) this;
        }

        public Criteria andNextrepaydateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("nextrepaydate not between", value1, value2, "nextrepaydate");
            return (Criteria) this;
        }

        public Criteria andTotalperiodsIsNull() {
            addCriterion("totalperiods is null");
            return (Criteria) this;
        }

        public Criteria andTotalperiodsIsNotNull() {
            addCriterion("totalperiods is not null");
            return (Criteria) this;
        }

        public Criteria andTotalperiodsEqualTo(String value) {
            addCriterion("totalperiods =", value, "totalperiods");
            return (Criteria) this;
        }

        public Criteria andTotalperiodsNotEqualTo(String value) {
            addCriterion("totalperiods <>", value, "totalperiods");
            return (Criteria) this;
        }

        public Criteria andTotalperiodsGreaterThan(String value) {
            addCriterion("totalperiods >", value, "totalperiods");
            return (Criteria) this;
        }

        public Criteria andTotalperiodsGreaterThanOrEqualTo(String value) {
            addCriterion("totalperiods >=", value, "totalperiods");
            return (Criteria) this;
        }

        public Criteria andTotalperiodsLessThan(String value) {
            addCriterion("totalperiods <", value, "totalperiods");
            return (Criteria) this;
        }

        public Criteria andTotalperiodsLessThanOrEqualTo(String value) {
            addCriterion("totalperiods <=", value, "totalperiods");
            return (Criteria) this;
        }

        public Criteria andTotalperiodsLike(String value) {
            addCriterion("totalperiods like", value, "totalperiods");
            return (Criteria) this;
        }

        public Criteria andTotalperiodsNotLike(String value) {
            addCriterion("totalperiods not like", value, "totalperiods");
            return (Criteria) this;
        }

        public Criteria andTotalperiodsIn(List<String> values) {
            addCriterion("totalperiods in", values, "totalperiods");
            return (Criteria) this;
        }

        public Criteria andTotalperiodsNotIn(List<String> values) {
            addCriterion("totalperiods not in", values, "totalperiods");
            return (Criteria) this;
        }

        public Criteria andTotalperiodsBetween(String value1, String value2) {
            addCriterion("totalperiods between", value1, value2, "totalperiods");
            return (Criteria) this;
        }

        public Criteria andTotalperiodsNotBetween(String value1, String value2) {
            addCriterion("totalperiods not between", value1, value2, "totalperiods");
            return (Criteria) this;
        }

        public Criteria andInvestmoneyIsNull() {
            addCriterion("investmoney is null");
            return (Criteria) this;
        }

        public Criteria andInvestmoneyIsNotNull() {
            addCriterion("investmoney is not null");
            return (Criteria) this;
        }

        public Criteria andInvestmoneyEqualTo(String value) {
            addCriterion("investmoney =", value, "investmoney");
            return (Criteria) this;
        }

        public Criteria andInvestmoneyNotEqualTo(String value) {
            addCriterion("investmoney <>", value, "investmoney");
            return (Criteria) this;
        }

        public Criteria andInvestmoneyGreaterThan(String value) {
            addCriterion("investmoney >", value, "investmoney");
            return (Criteria) this;
        }

        public Criteria andInvestmoneyGreaterThanOrEqualTo(String value) {
            addCriterion("investmoney >=", value, "investmoney");
            return (Criteria) this;
        }

        public Criteria andInvestmoneyLessThan(String value) {
            addCriterion("investmoney <", value, "investmoney");
            return (Criteria) this;
        }

        public Criteria andInvestmoneyLessThanOrEqualTo(String value) {
            addCriterion("investmoney <=", value, "investmoney");
            return (Criteria) this;
        }

        public Criteria andInvestmoneyLike(String value) {
            addCriterion("investmoney like", value, "investmoney");
            return (Criteria) this;
        }

        public Criteria andInvestmoneyNotLike(String value) {
            addCriterion("investmoney not like", value, "investmoney");
            return (Criteria) this;
        }

        public Criteria andInvestmoneyIn(List<String> values) {
            addCriterion("investmoney in", values, "investmoney");
            return (Criteria) this;
        }

        public Criteria andInvestmoneyNotIn(List<String> values) {
            addCriterion("investmoney not in", values, "investmoney");
            return (Criteria) this;
        }

        public Criteria andInvestmoneyBetween(String value1, String value2) {
            addCriterion("investmoney between", value1, value2, "investmoney");
            return (Criteria) this;
        }

        public Criteria andInvestmoneyNotBetween(String value1, String value2) {
            addCriterion("investmoney not between", value1, value2, "investmoney");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andMovemoneyIsNull() {
            addCriterion("movemoney is null");
            return (Criteria) this;
        }

        public Criteria andMovemoneyIsNotNull() {
            addCriterion("movemoney is not null");
            return (Criteria) this;
        }

        public Criteria andMovemoneyEqualTo(Long value) {
            addCriterion("movemoney =", value, "movemoney");
            return (Criteria) this;
        }

        public Criteria andMovemoneyNotEqualTo(Long value) {
            addCriterion("movemoney <>", value, "movemoney");
            return (Criteria) this;
        }

        public Criteria andMovemoneyGreaterThan(Long value) {
            addCriterion("movemoney >", value, "movemoney");
            return (Criteria) this;
        }

        public Criteria andMovemoneyGreaterThanOrEqualTo(Long value) {
            addCriterion("movemoney >=", value, "movemoney");
            return (Criteria) this;
        }

        public Criteria andMovemoneyLessThan(Long value) {
            addCriterion("movemoney <", value, "movemoney");
            return (Criteria) this;
        }

        public Criteria andMovemoneyLessThanOrEqualTo(Long value) {
            addCriterion("movemoney <=", value, "movemoney");
            return (Criteria) this;
        }

        public Criteria andMovemoneyIn(List<Long> values) {
            addCriterion("movemoney in", values, "movemoney");
            return (Criteria) this;
        }

        public Criteria andMovemoneyNotIn(List<Long> values) {
            addCriterion("movemoney not in", values, "movemoney");
            return (Criteria) this;
        }

        public Criteria andMovemoneyBetween(Long value1, Long value2) {
            addCriterion("movemoney between", value1, value2, "movemoney");
            return (Criteria) this;
        }

        public Criteria andMovemoneyNotBetween(Long value1, Long value2) {
            addCriterion("movemoney not between", value1, value2, "movemoney");
            return (Criteria) this;
        }

        public Criteria andMovedateIsNull() {
            addCriterion("movedate is null");
            return (Criteria) this;
        }

        public Criteria andMovedateIsNotNull() {
            addCriterion("movedate is not null");
            return (Criteria) this;
        }

        public Criteria andMovedateEqualTo(String value) {
            addCriterion("movedate =", value, "movedate");
            return (Criteria) this;
        }

        public Criteria andMovedateNotEqualTo(String value) {
            addCriterion("movedate <>", value, "movedate");
            return (Criteria) this;
        }

        public Criteria andMovedateGreaterThan(String value) {
            addCriterion("movedate >", value, "movedate");
            return (Criteria) this;
        }

        public Criteria andMovedateGreaterThanOrEqualTo(String value) {
            addCriterion("movedate >=", value, "movedate");
            return (Criteria) this;
        }

        public Criteria andMovedateLessThan(String value) {
            addCriterion("movedate <", value, "movedate");
            return (Criteria) this;
        }

        public Criteria andMovedateLessThanOrEqualTo(String value) {
            addCriterion("movedate <=", value, "movedate");
            return (Criteria) this;
        }

        public Criteria andMovedateLike(String value) {
            addCriterion("movedate like", value, "movedate");
            return (Criteria) this;
        }

        public Criteria andMovedateNotLike(String value) {
            addCriterion("movedate not like", value, "movedate");
            return (Criteria) this;
        }

        public Criteria andMovedateIn(List<String> values) {
            addCriterion("movedate in", values, "movedate");
            return (Criteria) this;
        }

        public Criteria andMovedateNotIn(List<String> values) {
            addCriterion("movedate not in", values, "movedate");
            return (Criteria) this;
        }

        public Criteria andMovedateBetween(String value1, String value2) {
            addCriterion("movedate between", value1, value2, "movedate");
            return (Criteria) this;
        }

        public Criteria andMovedateNotBetween(String value1, String value2) {
            addCriterion("movedate not between", value1, value2, "movedate");
            return (Criteria) this;
        }

        public Criteria andSurplusmoneyIsNull() {
            addCriterion("surplusmoney is null");
            return (Criteria) this;
        }

        public Criteria andSurplusmoneyIsNotNull() {
            addCriterion("surplusmoney is not null");
            return (Criteria) this;
        }

        public Criteria andSurplusmoneyEqualTo(String value) {
            addCriterion("surplusmoney =", value, "surplusmoney");
            return (Criteria) this;
        }

        public Criteria andSurplusmoneyNotEqualTo(String value) {
            addCriterion("surplusmoney <>", value, "surplusmoney");
            return (Criteria) this;
        }

        public Criteria andSurplusmoneyGreaterThan(String value) {
            addCriterion("surplusmoney >", value, "surplusmoney");
            return (Criteria) this;
        }

        public Criteria andSurplusmoneyGreaterThanOrEqualTo(String value) {
            addCriterion("surplusmoney >=", value, "surplusmoney");
            return (Criteria) this;
        }

        public Criteria andSurplusmoneyLessThan(String value) {
            addCriterion("surplusmoney <", value, "surplusmoney");
            return (Criteria) this;
        }

        public Criteria andSurplusmoneyLessThanOrEqualTo(String value) {
            addCriterion("surplusmoney <=", value, "surplusmoney");
            return (Criteria) this;
        }

        public Criteria andSurplusmoneyLike(String value) {
            addCriterion("surplusmoney like", value, "surplusmoney");
            return (Criteria) this;
        }

        public Criteria andSurplusmoneyNotLike(String value) {
            addCriterion("surplusmoney not like", value, "surplusmoney");
            return (Criteria) this;
        }

        public Criteria andSurplusmoneyIn(List<String> values) {
            addCriterion("surplusmoney in", values, "surplusmoney");
            return (Criteria) this;
        }

        public Criteria andSurplusmoneyNotIn(List<String> values) {
            addCriterion("surplusmoney not in", values, "surplusmoney");
            return (Criteria) this;
        }

        public Criteria andSurplusmoneyBetween(String value1, String value2) {
            addCriterion("surplusmoney between", value1, value2, "surplusmoney");
            return (Criteria) this;
        }

        public Criteria andSurplusmoneyNotBetween(String value1, String value2) {
            addCriterion("surplusmoney not between", value1, value2, "surplusmoney");
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