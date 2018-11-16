package com.dcm.more_ds.query.sqlserver;

import com.dcm.more_ds.constant.base.BaseExample;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ProsonmanagementInterfaceExample extends BaseExample {

	private static final long serialVersionUID = 7681422730232227770L;

    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProsonmanagementInterfaceExample() {
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

protected abstract static class GeneratedCriteria implements Serializable {

	private static final long serialVersionUID = 628029899438978030L;

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

        public Criteria andZfBhIsNull() {
            addCriterion("zf_bh is null");
            return (Criteria) this;
        }

        public Criteria andZfBhIsNotNull() {
            addCriterion("zf_bh is not null");
            return (Criteria) this;
        }

        public Criteria andZfBhEqualTo(String value) {
            addCriterion("zf_bh =", value, "zfBh");
            return (Criteria) this;
        }

        public Criteria andZfBhNotEqualTo(String value) {
            addCriterion("zf_bh <>", value, "zfBh");
            return (Criteria) this;
        }

        public Criteria andZfBhGreaterThan(String value) {
            addCriterion("zf_bh >", value, "zfBh");
            return (Criteria) this;
        }

        public Criteria andZfBhGreaterThanOrEqualTo(String value) {
            addCriterion("zf_bh >=", value, "zfBh");
            return (Criteria) this;
        }

        public Criteria andZfBhLessThan(String value) {
            addCriterion("zf_bh <", value, "zfBh");
            return (Criteria) this;
        }

        public Criteria andZfBhLessThanOrEqualTo(String value) {
            addCriterion("zf_bh <=", value, "zfBh");
            return (Criteria) this;
        }

        public Criteria andZfBhLike(String value) {
            addCriterion("zf_bh like", value, "zfBh");
            return (Criteria) this;
        }

        public Criteria andZfBhNotLike(String value) {
            addCriterion("zf_bh not like", value, "zfBh");
            return (Criteria) this;
        }

        public Criteria andZfBhIn(List<String> values) {
            addCriterion("zf_bh in", values, "zfBh");
            return (Criteria) this;
        }

        public Criteria andZfBhNotIn(List<String> values) {
            addCriterion("zf_bh not in", values, "zfBh");
            return (Criteria) this;
        }

        public Criteria andZfBhBetween(String value1, String value2) {
            addCriterion("zf_bh between", value1, value2, "zfBh");
            return (Criteria) this;
        }

        public Criteria andZfBhNotBetween(String value1, String value2) {
            addCriterion("zf_bh not between", value1, value2, "zfBh");
            return (Criteria) this;
        }

        public Criteria andXmIsNull() {
            addCriterion("xm is null");
            return (Criteria) this;
        }

        public Criteria andXmIsNotNull() {
            addCriterion("xm is not null");
            return (Criteria) this;
        }

        public Criteria andXmEqualTo(String value) {
            addCriterion("xm =", value, "xm");
            return (Criteria) this;
        }

        public Criteria andXmNotEqualTo(String value) {
            addCriterion("xm <>", value, "xm");
            return (Criteria) this;
        }

        public Criteria andXmGreaterThan(String value) {
            addCriterion("xm >", value, "xm");
            return (Criteria) this;
        }

        public Criteria andXmGreaterThanOrEqualTo(String value) {
            addCriterion("xm >=", value, "xm");
            return (Criteria) this;
        }

        public Criteria andXmLessThan(String value) {
            addCriterion("xm <", value, "xm");
            return (Criteria) this;
        }

        public Criteria andXmLessThanOrEqualTo(String value) {
            addCriterion("xm <=", value, "xm");
            return (Criteria) this;
        }

        public Criteria andXmLike(String value) {
            addCriterion("xm like", value, "xm");
            return (Criteria) this;
        }

        public Criteria andXmNotLike(String value) {
            addCriterion("xm not like", value, "xm");
            return (Criteria) this;
        }

        public Criteria andXmIn(List<String> values) {
            addCriterion("xm in", values, "xm");
            return (Criteria) this;
        }

        public Criteria andXmNotIn(List<String> values) {
            addCriterion("xm not in", values, "xm");
            return (Criteria) this;
        }

        public Criteria andXmBetween(String value1, String value2) {
            addCriterion("xm between", value1, value2, "xm");
            return (Criteria) this;
        }

        public Criteria andXmNotBetween(String value1, String value2) {
            addCriterion("xm not between", value1, value2, "xm");
            return (Criteria) this;
        }

        public Criteria andZsxmIsNull() {
            addCriterion("zsxm is null");
            return (Criteria) this;
        }

        public Criteria andZsxmIsNotNull() {
            addCriterion("zsxm is not null");
            return (Criteria) this;
        }

        public Criteria andZsxmEqualTo(String value) {
            addCriterion("zsxm =", value, "zsxm");
            return (Criteria) this;
        }

        public Criteria andZsxmNotEqualTo(String value) {
            addCriterion("zsxm <>", value, "zsxm");
            return (Criteria) this;
        }

        public Criteria andZsxmGreaterThan(String value) {
            addCriterion("zsxm >", value, "zsxm");
            return (Criteria) this;
        }

        public Criteria andZsxmGreaterThanOrEqualTo(String value) {
            addCriterion("zsxm >=", value, "zsxm");
            return (Criteria) this;
        }

        public Criteria andZsxmLessThan(String value) {
            addCriterion("zsxm <", value, "zsxm");
            return (Criteria) this;
        }

        public Criteria andZsxmLessThanOrEqualTo(String value) {
            addCriterion("zsxm <=", value, "zsxm");
            return (Criteria) this;
        }

        public Criteria andZsxmLike(String value) {
            addCriterion("zsxm like", value, "zsxm");
            return (Criteria) this;
        }

        public Criteria andZsxmNotLike(String value) {
            addCriterion("zsxm not like", value, "zsxm");
            return (Criteria) this;
        }

        public Criteria andZsxmIn(List<String> values) {
            addCriterion("zsxm in", values, "zsxm");
            return (Criteria) this;
        }

        public Criteria andZsxmNotIn(List<String> values) {
            addCriterion("zsxm not in", values, "zsxm");
            return (Criteria) this;
        }

        public Criteria andZsxmBetween(String value1, String value2) {
            addCriterion("zsxm between", value1, value2, "zsxm");
            return (Criteria) this;
        }

        public Criteria andZsxmNotBetween(String value1, String value2) {
            addCriterion("zsxm not between", value1, value2, "zsxm");
            return (Criteria) this;
        }

        public Criteria andXbIsNull() {
            addCriterion("xb is null");
            return (Criteria) this;
        }

        public Criteria andXbIsNotNull() {
            addCriterion("xb is not null");
            return (Criteria) this;
        }

        public Criteria andXbEqualTo(String value) {
            addCriterion("xb =", value, "xb");
            return (Criteria) this;
        }

        public Criteria andXbNotEqualTo(String value) {
            addCriterion("xb <>", value, "xb");
            return (Criteria) this;
        }

        public Criteria andXbGreaterThan(String value) {
            addCriterion("xb >", value, "xb");
            return (Criteria) this;
        }

        public Criteria andXbGreaterThanOrEqualTo(String value) {
            addCriterion("xb >=", value, "xb");
            return (Criteria) this;
        }

        public Criteria andXbLessThan(String value) {
            addCriterion("xb <", value, "xb");
            return (Criteria) this;
        }

        public Criteria andXbLessThanOrEqualTo(String value) {
            addCriterion("xb <=", value, "xb");
            return (Criteria) this;
        }

        public Criteria andXbLike(String value) {
            addCriterion("xb like", value, "xb");
            return (Criteria) this;
        }

        public Criteria andXbNotLike(String value) {
            addCriterion("xb not like", value, "xb");
            return (Criteria) this;
        }

        public Criteria andXbIn(List<String> values) {
            addCriterion("xb in", values, "xb");
            return (Criteria) this;
        }

        public Criteria andXbNotIn(List<String> values) {
            addCriterion("xb not in", values, "xb");
            return (Criteria) this;
        }

        public Criteria andXbBetween(String value1, String value2) {
            addCriterion("xb between", value1, value2, "xb");
            return (Criteria) this;
        }

        public Criteria andXbNotBetween(String value1, String value2) {
            addCriterion("xb not between", value1, value2, "xb");
            return (Criteria) this;
        }

        public Criteria andCsrqIsNull() {
            addCriterion("CSRQ is null");
            return (Criteria) this;
        }

        public Criteria andCsrqIsNotNull() {
            addCriterion("CSRQ is not null");
            return (Criteria) this;
        }

        public Criteria andCsrqEqualTo(Date value) {
            addCriterion("CSRQ =", value, "csrq");
            return (Criteria) this;
        }

        public Criteria andCsrqNotEqualTo(Date value) {
            addCriterion("CSRQ <>", value, "csrq");
            return (Criteria) this;
        }

        public Criteria andCsrqGreaterThan(Date value) {
            addCriterion("CSRQ >", value, "csrq");
            return (Criteria) this;
        }

        public Criteria andCsrqGreaterThanOrEqualTo(Date value) {
            addCriterion("CSRQ >=", value, "csrq");
            return (Criteria) this;
        }

        public Criteria andCsrqLessThan(Date value) {
            addCriterion("CSRQ <", value, "csrq");
            return (Criteria) this;
        }

        public Criteria andCsrqLessThanOrEqualTo(Date value) {
            addCriterion("CSRQ <=", value, "csrq");
            return (Criteria) this;
        }

        public Criteria andCsrqIn(List<Date> values) {
            addCriterion("CSRQ in", values, "csrq");
            return (Criteria) this;
        }

        public Criteria andCsrqNotIn(List<Date> values) {
            addCriterion("CSRQ not in", values, "csrq");
            return (Criteria) this;
        }

        public Criteria andCsrqBetween(Date value1, Date value2) {
            addCriterion("CSRQ between", value1, value2, "csrq");
            return (Criteria) this;
        }

        public Criteria andCsrqNotBetween(Date value1, Date value2) {
            addCriterion("CSRQ not between", value1, value2, "csrq");
            return (Criteria) this;
        }

        public Criteria andMzIsNull() {
            addCriterion("mz is null");
            return (Criteria) this;
        }

        public Criteria andMzIsNotNull() {
            addCriterion("mz is not null");
            return (Criteria) this;
        }

        public Criteria andMzEqualTo(String value) {
            addCriterion("mz =", value, "mz");
            return (Criteria) this;
        }

        public Criteria andMzNotEqualTo(String value) {
            addCriterion("mz <>", value, "mz");
            return (Criteria) this;
        }

        public Criteria andMzGreaterThan(String value) {
            addCriterion("mz >", value, "mz");
            return (Criteria) this;
        }

        public Criteria andMzGreaterThanOrEqualTo(String value) {
            addCriterion("mz >=", value, "mz");
            return (Criteria) this;
        }

        public Criteria andMzLessThan(String value) {
            addCriterion("mz <", value, "mz");
            return (Criteria) this;
        }

        public Criteria andMzLessThanOrEqualTo(String value) {
            addCriterion("mz <=", value, "mz");
            return (Criteria) this;
        }

        public Criteria andMzLike(String value) {
            addCriterion("mz like", value, "mz");
            return (Criteria) this;
        }

        public Criteria andMzNotLike(String value) {
            addCriterion("mz not like", value, "mz");
            return (Criteria) this;
        }

        public Criteria andMzIn(List<String> values) {
            addCriterion("mz in", values, "mz");
            return (Criteria) this;
        }

        public Criteria andMzNotIn(List<String> values) {
            addCriterion("mz not in", values, "mz");
            return (Criteria) this;
        }

        public Criteria andMzBetween(String value1, String value2) {
            addCriterion("mz between", value1, value2, "mz");
            return (Criteria) this;
        }

        public Criteria andMzNotBetween(String value1, String value2) {
            addCriterion("mz not between", value1, value2, "mz");
            return (Criteria) this;
        }

        public Criteria andBqwhcdIsNull() {
            addCriterion("BQWHCD is null");
            return (Criteria) this;
        }

        public Criteria andBqwhcdIsNotNull() {
            addCriterion("BQWHCD is not null");
            return (Criteria) this;
        }

        public Criteria andBqwhcdEqualTo(String value) {
            addCriterion("BQWHCD =", value, "bqwhcd");
            return (Criteria) this;
        }

        public Criteria andBqwhcdNotEqualTo(String value) {
            addCriterion("BQWHCD <>", value, "bqwhcd");
            return (Criteria) this;
        }

        public Criteria andBqwhcdGreaterThan(String value) {
            addCriterion("BQWHCD >", value, "bqwhcd");
            return (Criteria) this;
        }

        public Criteria andBqwhcdGreaterThanOrEqualTo(String value) {
            addCriterion("BQWHCD >=", value, "bqwhcd");
            return (Criteria) this;
        }

        public Criteria andBqwhcdLessThan(String value) {
            addCriterion("BQWHCD <", value, "bqwhcd");
            return (Criteria) this;
        }

        public Criteria andBqwhcdLessThanOrEqualTo(String value) {
            addCriterion("BQWHCD <=", value, "bqwhcd");
            return (Criteria) this;
        }

        public Criteria andBqwhcdLike(String value) {
            addCriterion("BQWHCD like", value, "bqwhcd");
            return (Criteria) this;
        }

        public Criteria andBqwhcdNotLike(String value) {
            addCriterion("BQWHCD not like", value, "bqwhcd");
            return (Criteria) this;
        }

        public Criteria andBqwhcdIn(List<String> values) {
            addCriterion("BQWHCD in", values, "bqwhcd");
            return (Criteria) this;
        }

        public Criteria andBqwhcdNotIn(List<String> values) {
            addCriterion("BQWHCD not in", values, "bqwhcd");
            return (Criteria) this;
        }

        public Criteria andBqwhcdBetween(String value1, String value2) {
            addCriterion("BQWHCD between", value1, value2, "bqwhcd");
            return (Criteria) this;
        }

        public Criteria andBqwhcdNotBetween(String value1, String value2) {
            addCriterion("BQWHCD not between", value1, value2, "bqwhcd");
            return (Criteria) this;
        }

        public Criteria andHyzkIsNull() {
            addCriterion("hyzk is null");
            return (Criteria) this;
        }

        public Criteria andHyzkIsNotNull() {
            addCriterion("hyzk is not null");
            return (Criteria) this;
        }

        public Criteria andHyzkEqualTo(String value) {
            addCriterion("hyzk =", value, "hyzk");
            return (Criteria) this;
        }

        public Criteria andHyzkNotEqualTo(String value) {
            addCriterion("hyzk <>", value, "hyzk");
            return (Criteria) this;
        }

        public Criteria andHyzkGreaterThan(String value) {
            addCriterion("hyzk >", value, "hyzk");
            return (Criteria) this;
        }

        public Criteria andHyzkGreaterThanOrEqualTo(String value) {
            addCriterion("hyzk >=", value, "hyzk");
            return (Criteria) this;
        }

        public Criteria andHyzkLessThan(String value) {
            addCriterion("hyzk <", value, "hyzk");
            return (Criteria) this;
        }

        public Criteria andHyzkLessThanOrEqualTo(String value) {
            addCriterion("hyzk <=", value, "hyzk");
            return (Criteria) this;
        }

        public Criteria andHyzkLike(String value) {
            addCriterion("hyzk like", value, "hyzk");
            return (Criteria) this;
        }

        public Criteria andHyzkNotLike(String value) {
            addCriterion("hyzk not like", value, "hyzk");
            return (Criteria) this;
        }

        public Criteria andHyzkIn(List<String> values) {
            addCriterion("hyzk in", values, "hyzk");
            return (Criteria) this;
        }

        public Criteria andHyzkNotIn(List<String> values) {
            addCriterion("hyzk not in", values, "hyzk");
            return (Criteria) this;
        }

        public Criteria andHyzkBetween(String value1, String value2) {
            addCriterion("hyzk between", value1, value2, "hyzk");
            return (Criteria) this;
        }

        public Criteria andHyzkNotBetween(String value1, String value2) {
            addCriterion("hyzk not between", value1, value2, "hyzk");
            return (Criteria) this;
        }

        public Criteria andBqmmIsNull() {
            addCriterion("bqmm is null");
            return (Criteria) this;
        }

        public Criteria andBqmmIsNotNull() {
            addCriterion("bqmm is not null");
            return (Criteria) this;
        }

        public Criteria andBqmmEqualTo(String value) {
            addCriterion("bqmm =", value, "bqmm");
            return (Criteria) this;
        }

        public Criteria andBqmmNotEqualTo(String value) {
            addCriterion("bqmm <>", value, "bqmm");
            return (Criteria) this;
        }

        public Criteria andBqmmGreaterThan(String value) {
            addCriterion("bqmm >", value, "bqmm");
            return (Criteria) this;
        }

        public Criteria andBqmmGreaterThanOrEqualTo(String value) {
            addCriterion("bqmm >=", value, "bqmm");
            return (Criteria) this;
        }

        public Criteria andBqmmLessThan(String value) {
            addCriterion("bqmm <", value, "bqmm");
            return (Criteria) this;
        }

        public Criteria andBqmmLessThanOrEqualTo(String value) {
            addCriterion("bqmm <=", value, "bqmm");
            return (Criteria) this;
        }

        public Criteria andBqmmLike(String value) {
            addCriterion("bqmm like", value, "bqmm");
            return (Criteria) this;
        }

        public Criteria andBqmmNotLike(String value) {
            addCriterion("bqmm not like", value, "bqmm");
            return (Criteria) this;
        }

        public Criteria andBqmmIn(List<String> values) {
            addCriterion("bqmm in", values, "bqmm");
            return (Criteria) this;
        }

        public Criteria andBqmmNotIn(List<String> values) {
            addCriterion("bqmm not in", values, "bqmm");
            return (Criteria) this;
        }

        public Criteria andBqmmBetween(String value1, String value2) {
            addCriterion("bqmm between", value1, value2, "bqmm");
            return (Criteria) this;
        }

        public Criteria andBqmmNotBetween(String value1, String value2) {
            addCriterion("bqmm not between", value1, value2, "bqmm");
            return (Criteria) this;
        }

        public Criteria andBqzyIsNull() {
            addCriterion("bqzy is null");
            return (Criteria) this;
        }

        public Criteria andBqzyIsNotNull() {
            addCriterion("bqzy is not null");
            return (Criteria) this;
        }

        public Criteria andBqzyEqualTo(String value) {
            addCriterion("bqzy =", value, "bqzy");
            return (Criteria) this;
        }

        public Criteria andBqzyNotEqualTo(String value) {
            addCriterion("bqzy <>", value, "bqzy");
            return (Criteria) this;
        }

        public Criteria andBqzyGreaterThan(String value) {
            addCriterion("bqzy >", value, "bqzy");
            return (Criteria) this;
        }

        public Criteria andBqzyGreaterThanOrEqualTo(String value) {
            addCriterion("bqzy >=", value, "bqzy");
            return (Criteria) this;
        }

        public Criteria andBqzyLessThan(String value) {
            addCriterion("bqzy <", value, "bqzy");
            return (Criteria) this;
        }

        public Criteria andBqzyLessThanOrEqualTo(String value) {
            addCriterion("bqzy <=", value, "bqzy");
            return (Criteria) this;
        }

        public Criteria andBqzyLike(String value) {
            addCriterion("bqzy like", value, "bqzy");
            return (Criteria) this;
        }

        public Criteria andBqzyNotLike(String value) {
            addCriterion("bqzy not like", value, "bqzy");
            return (Criteria) this;
        }

        public Criteria andBqzyIn(List<String> values) {
            addCriterion("bqzy in", values, "bqzy");
            return (Criteria) this;
        }

        public Criteria andBqzyNotIn(List<String> values) {
            addCriterion("bqzy not in", values, "bqzy");
            return (Criteria) this;
        }

        public Criteria andBqzyBetween(String value1, String value2) {
            addCriterion("bqzy between", value1, value2, "bqzy");
            return (Criteria) this;
        }

        public Criteria andBqzyNotBetween(String value1, String value2) {
            addCriterion("bqzy not between", value1, value2, "bqzy");
            return (Criteria) this;
        }

        public Criteria andBqzcIsNull() {
            addCriterion("bqzc is null");
            return (Criteria) this;
        }

        public Criteria andBqzcIsNotNull() {
            addCriterion("bqzc is not null");
            return (Criteria) this;
        }

        public Criteria andBqzcEqualTo(String value) {
            addCriterion("bqzc =", value, "bqzc");
            return (Criteria) this;
        }

        public Criteria andBqzcNotEqualTo(String value) {
            addCriterion("bqzc <>", value, "bqzc");
            return (Criteria) this;
        }

        public Criteria andBqzcGreaterThan(String value) {
            addCriterion("bqzc >", value, "bqzc");
            return (Criteria) this;
        }

        public Criteria andBqzcGreaterThanOrEqualTo(String value) {
            addCriterion("bqzc >=", value, "bqzc");
            return (Criteria) this;
        }

        public Criteria andBqzcLessThan(String value) {
            addCriterion("bqzc <", value, "bqzc");
            return (Criteria) this;
        }

        public Criteria andBqzcLessThanOrEqualTo(String value) {
            addCriterion("bqzc <=", value, "bqzc");
            return (Criteria) this;
        }

        public Criteria andBqzcLike(String value) {
            addCriterion("bqzc like", value, "bqzc");
            return (Criteria) this;
        }

        public Criteria andBqzcNotLike(String value) {
            addCriterion("bqzc not like", value, "bqzc");
            return (Criteria) this;
        }

        public Criteria andBqzcIn(List<String> values) {
            addCriterion("bqzc in", values, "bqzc");
            return (Criteria) this;
        }

        public Criteria andBqzcNotIn(List<String> values) {
            addCriterion("bqzc not in", values, "bqzc");
            return (Criteria) this;
        }

        public Criteria andBqzcBetween(String value1, String value2) {
            addCriterion("bqzc between", value1, value2, "bqzc");
            return (Criteria) this;
        }

        public Criteria andBqzcNotBetween(String value1, String value2) {
            addCriterion("bqzc not between", value1, value2, "bqzc");
            return (Criteria) this;
        }

        public Criteria andBqzjIsNull() {
            addCriterion("bqzj is null");
            return (Criteria) this;
        }

        public Criteria andBqzjIsNotNull() {
            addCriterion("bqzj is not null");
            return (Criteria) this;
        }

        public Criteria andBqzjEqualTo(String value) {
            addCriterion("bqzj =", value, "bqzj");
            return (Criteria) this;
        }

        public Criteria andBqzjNotEqualTo(String value) {
            addCriterion("bqzj <>", value, "bqzj");
            return (Criteria) this;
        }

        public Criteria andBqzjGreaterThan(String value) {
            addCriterion("bqzj >", value, "bqzj");
            return (Criteria) this;
        }

        public Criteria andBqzjGreaterThanOrEqualTo(String value) {
            addCriterion("bqzj >=", value, "bqzj");
            return (Criteria) this;
        }

        public Criteria andBqzjLessThan(String value) {
            addCriterion("bqzj <", value, "bqzj");
            return (Criteria) this;
        }

        public Criteria andBqzjLessThanOrEqualTo(String value) {
            addCriterion("bqzj <=", value, "bqzj");
            return (Criteria) this;
        }

        public Criteria andBqzjLike(String value) {
            addCriterion("bqzj like", value, "bqzj");
            return (Criteria) this;
        }

        public Criteria andBqzjNotLike(String value) {
            addCriterion("bqzj not like", value, "bqzj");
            return (Criteria) this;
        }

        public Criteria andBqzjIn(List<String> values) {
            addCriterion("bqzj in", values, "bqzj");
            return (Criteria) this;
        }

        public Criteria andBqzjNotIn(List<String> values) {
            addCriterion("bqzj not in", values, "bqzj");
            return (Criteria) this;
        }

        public Criteria andBqzjBetween(String value1, String value2) {
            addCriterion("bqzj between", value1, value2, "bqzj");
            return (Criteria) this;
        }

        public Criteria andBqzjNotBetween(String value1, String value2) {
            addCriterion("bqzj not between", value1, value2, "bqzj");
            return (Criteria) this;
        }

        public Criteria andSxzyIsNull() {
            addCriterion("sxzy is null");
            return (Criteria) this;
        }

        public Criteria andSxzyIsNotNull() {
            addCriterion("sxzy is not null");
            return (Criteria) this;
        }

        public Criteria andSxzyEqualTo(String value) {
            addCriterion("sxzy =", value, "sxzy");
            return (Criteria) this;
        }

        public Criteria andSxzyNotEqualTo(String value) {
            addCriterion("sxzy <>", value, "sxzy");
            return (Criteria) this;
        }

        public Criteria andSxzyGreaterThan(String value) {
            addCriterion("sxzy >", value, "sxzy");
            return (Criteria) this;
        }

        public Criteria andSxzyGreaterThanOrEqualTo(String value) {
            addCriterion("sxzy >=", value, "sxzy");
            return (Criteria) this;
        }

        public Criteria andSxzyLessThan(String value) {
            addCriterion("sxzy <", value, "sxzy");
            return (Criteria) this;
        }

        public Criteria andSxzyLessThanOrEqualTo(String value) {
            addCriterion("sxzy <=", value, "sxzy");
            return (Criteria) this;
        }

        public Criteria andSxzyLike(String value) {
            addCriterion("sxzy like", value, "sxzy");
            return (Criteria) this;
        }

        public Criteria andSxzyNotLike(String value) {
            addCriterion("sxzy not like", value, "sxzy");
            return (Criteria) this;
        }

        public Criteria andSxzyIn(List<String> values) {
            addCriterion("sxzy in", values, "sxzy");
            return (Criteria) this;
        }

        public Criteria andSxzyNotIn(List<String> values) {
            addCriterion("sxzy not in", values, "sxzy");
            return (Criteria) this;
        }

        public Criteria andSxzyBetween(String value1, String value2) {
            addCriterion("sxzy between", value1, value2, "sxzy");
            return (Criteria) this;
        }

        public Criteria andSxzyNotBetween(String value1, String value2) {
            addCriterion("sxzy not between", value1, value2, "sxzy");
            return (Criteria) this;
        }

        public Criteria andTcIsNull() {
            addCriterion("tc is null");
            return (Criteria) this;
        }

        public Criteria andTcIsNotNull() {
            addCriterion("tc is not null");
            return (Criteria) this;
        }

        public Criteria andTcEqualTo(String value) {
            addCriterion("tc =", value, "tc");
            return (Criteria) this;
        }

        public Criteria andTcNotEqualTo(String value) {
            addCriterion("tc <>", value, "tc");
            return (Criteria) this;
        }

        public Criteria andTcGreaterThan(String value) {
            addCriterion("tc >", value, "tc");
            return (Criteria) this;
        }

        public Criteria andTcGreaterThanOrEqualTo(String value) {
            addCriterion("tc >=", value, "tc");
            return (Criteria) this;
        }

        public Criteria andTcLessThan(String value) {
            addCriterion("tc <", value, "tc");
            return (Criteria) this;
        }

        public Criteria andTcLessThanOrEqualTo(String value) {
            addCriterion("tc <=", value, "tc");
            return (Criteria) this;
        }

        public Criteria andTcLike(String value) {
            addCriterion("tc like", value, "tc");
            return (Criteria) this;
        }

        public Criteria andTcNotLike(String value) {
            addCriterion("tc not like", value, "tc");
            return (Criteria) this;
        }

        public Criteria andTcIn(List<String> values) {
            addCriterion("tc in", values, "tc");
            return (Criteria) this;
        }

        public Criteria andTcNotIn(List<String> values) {
            addCriterion("tc not in", values, "tc");
            return (Criteria) this;
        }

        public Criteria andTcBetween(String value1, String value2) {
            addCriterion("tc between", value1, value2, "tc");
            return (Criteria) this;
        }

        public Criteria andTcNotBetween(String value1, String value2) {
            addCriterion("tc not between", value1, value2, "tc");
            return (Criteria) this;
        }

        public Criteria andDpttIsNull() {
            addCriterion("dptt is null");
            return (Criteria) this;
        }

        public Criteria andDpttIsNotNull() {
            addCriterion("dptt is not null");
            return (Criteria) this;
        }

        public Criteria andDpttEqualTo(String value) {
            addCriterion("dptt =", value, "dptt");
            return (Criteria) this;
        }

        public Criteria andDpttNotEqualTo(String value) {
            addCriterion("dptt <>", value, "dptt");
            return (Criteria) this;
        }

        public Criteria andDpttGreaterThan(String value) {
            addCriterion("dptt >", value, "dptt");
            return (Criteria) this;
        }

        public Criteria andDpttGreaterThanOrEqualTo(String value) {
            addCriterion("dptt >=", value, "dptt");
            return (Criteria) this;
        }

        public Criteria andDpttLessThan(String value) {
            addCriterion("dptt <", value, "dptt");
            return (Criteria) this;
        }

        public Criteria andDpttLessThanOrEqualTo(String value) {
            addCriterion("dptt <=", value, "dptt");
            return (Criteria) this;
        }

        public Criteria andDpttLike(String value) {
            addCriterion("dptt like", value, "dptt");
            return (Criteria) this;
        }

        public Criteria andDpttNotLike(String value) {
            addCriterion("dptt not like", value, "dptt");
            return (Criteria) this;
        }

        public Criteria andDpttIn(List<String> values) {
            addCriterion("dptt in", values, "dptt");
            return (Criteria) this;
        }

        public Criteria andDpttNotIn(List<String> values) {
            addCriterion("dptt not in", values, "dptt");
            return (Criteria) this;
        }

        public Criteria andDpttBetween(String value1, String value2) {
            addCriterion("dptt between", value1, value2, "dptt");
            return (Criteria) this;
        }

        public Criteria andDpttNotBetween(String value1, String value2) {
            addCriterion("dptt not between", value1, value2, "dptt");
            return (Criteria) this;
        }

        public Criteria andZjlxIsNull() {
            addCriterion("zjlx is null");
            return (Criteria) this;
        }

        public Criteria andZjlxIsNotNull() {
            addCriterion("zjlx is not null");
            return (Criteria) this;
        }

        public Criteria andZjlxEqualTo(String value) {
            addCriterion("zjlx =", value, "zjlx");
            return (Criteria) this;
        }

        public Criteria andZjlxNotEqualTo(String value) {
            addCriterion("zjlx <>", value, "zjlx");
            return (Criteria) this;
        }

        public Criteria andZjlxGreaterThan(String value) {
            addCriterion("zjlx >", value, "zjlx");
            return (Criteria) this;
        }

        public Criteria andZjlxGreaterThanOrEqualTo(String value) {
            addCriterion("zjlx >=", value, "zjlx");
            return (Criteria) this;
        }

        public Criteria andZjlxLessThan(String value) {
            addCriterion("zjlx <", value, "zjlx");
            return (Criteria) this;
        }

        public Criteria andZjlxLessThanOrEqualTo(String value) {
            addCriterion("zjlx <=", value, "zjlx");
            return (Criteria) this;
        }

        public Criteria andZjlxLike(String value) {
            addCriterion("zjlx like", value, "zjlx");
            return (Criteria) this;
        }

        public Criteria andZjlxNotLike(String value) {
            addCriterion("zjlx not like", value, "zjlx");
            return (Criteria) this;
        }

        public Criteria andZjlxIn(List<String> values) {
            addCriterion("zjlx in", values, "zjlx");
            return (Criteria) this;
        }

        public Criteria andZjlxNotIn(List<String> values) {
            addCriterion("zjlx not in", values, "zjlx");
            return (Criteria) this;
        }

        public Criteria andZjlxBetween(String value1, String value2) {
            addCriterion("zjlx between", value1, value2, "zjlx");
            return (Criteria) this;
        }

        public Criteria andZjlxNotBetween(String value1, String value2) {
            addCriterion("zjlx not between", value1, value2, "zjlx");
            return (Criteria) this;
        }

        public Criteria andZjhmIsNull() {
            addCriterion("zjhm is null");
            return (Criteria) this;
        }

        public Criteria andZjhmIsNotNull() {
            addCriterion("zjhm is not null");
            return (Criteria) this;
        }

        public Criteria andZjhmEqualTo(String value) {
            addCriterion("zjhm =", value, "zjhm");
            return (Criteria) this;
        }

        public Criteria andZjhmNotEqualTo(String value) {
            addCriterion("zjhm <>", value, "zjhm");
            return (Criteria) this;
        }

        public Criteria andZjhmGreaterThan(String value) {
            addCriterion("zjhm >", value, "zjhm");
            return (Criteria) this;
        }

        public Criteria andZjhmGreaterThanOrEqualTo(String value) {
            addCriterion("zjhm >=", value, "zjhm");
            return (Criteria) this;
        }

        public Criteria andZjhmLessThan(String value) {
            addCriterion("zjhm <", value, "zjhm");
            return (Criteria) this;
        }

        public Criteria andZjhmLessThanOrEqualTo(String value) {
            addCriterion("zjhm <=", value, "zjhm");
            return (Criteria) this;
        }

        public Criteria andZjhmLike(String value) {
            addCriterion("zjhm like", value, "zjhm");
            return (Criteria) this;
        }

        public Criteria andZjhmNotLike(String value) {
            addCriterion("zjhm not like", value, "zjhm");
            return (Criteria) this;
        }

        public Criteria andZjhmIn(List<String> values) {
            addCriterion("zjhm in", values, "zjhm");
            return (Criteria) this;
        }

        public Criteria andZjhmNotIn(List<String> values) {
            addCriterion("zjhm not in", values, "zjhm");
            return (Criteria) this;
        }

        public Criteria andZjhmBetween(String value1, String value2) {
            addCriterion("zjhm between", value1, value2, "zjhm");
            return (Criteria) this;
        }

        public Criteria andZjhmNotBetween(String value1, String value2) {
            addCriterion("zjhm not between", value1, value2, "zjhm");
            return (Criteria) this;
        }

        public Criteria andGjdqIsNull() {
            addCriterion("gjdq is null");
            return (Criteria) this;
        }

        public Criteria andGjdqIsNotNull() {
            addCriterion("gjdq is not null");
            return (Criteria) this;
        }

        public Criteria andGjdqEqualTo(String value) {
            addCriterion("gjdq =", value, "gjdq");
            return (Criteria) this;
        }

        public Criteria andGjdqNotEqualTo(String value) {
            addCriterion("gjdq <>", value, "gjdq");
            return (Criteria) this;
        }

        public Criteria andGjdqGreaterThan(String value) {
            addCriterion("gjdq >", value, "gjdq");
            return (Criteria) this;
        }

        public Criteria andGjdqGreaterThanOrEqualTo(String value) {
            addCriterion("gjdq >=", value, "gjdq");
            return (Criteria) this;
        }

        public Criteria andGjdqLessThan(String value) {
            addCriterion("gjdq <", value, "gjdq");
            return (Criteria) this;
        }

        public Criteria andGjdqLessThanOrEqualTo(String value) {
            addCriterion("gjdq <=", value, "gjdq");
            return (Criteria) this;
        }

        public Criteria andGjdqLike(String value) {
            addCriterion("gjdq like", value, "gjdq");
            return (Criteria) this;
        }

        public Criteria andGjdqNotLike(String value) {
            addCriterion("gjdq not like", value, "gjdq");
            return (Criteria) this;
        }

        public Criteria andGjdqIn(List<String> values) {
            addCriterion("gjdq in", values, "gjdq");
            return (Criteria) this;
        }

        public Criteria andGjdqNotIn(List<String> values) {
            addCriterion("gjdq not in", values, "gjdq");
            return (Criteria) this;
        }

        public Criteria andGjdqBetween(String value1, String value2) {
            addCriterion("gjdq between", value1, value2, "gjdq");
            return (Criteria) this;
        }

        public Criteria andGjdqNotBetween(String value1, String value2) {
            addCriterion("gjdq not between", value1, value2, "gjdq");
            return (Criteria) this;
        }

        public Criteria andJgqhIsNull() {
            addCriterion("JGQH is null");
            return (Criteria) this;
        }

        public Criteria andJgqhIsNotNull() {
            addCriterion("JGQH is not null");
            return (Criteria) this;
        }

        public Criteria andJgqhEqualTo(String value) {
            addCriterion("JGQH =", value, "jgqh");
            return (Criteria) this;
        }

        public Criteria andJgqhNotEqualTo(String value) {
            addCriterion("JGQH <>", value, "jgqh");
            return (Criteria) this;
        }

        public Criteria andJgqhGreaterThan(String value) {
            addCriterion("JGQH >", value, "jgqh");
            return (Criteria) this;
        }

        public Criteria andJgqhGreaterThanOrEqualTo(String value) {
            addCriterion("JGQH >=", value, "jgqh");
            return (Criteria) this;
        }

        public Criteria andJgqhLessThan(String value) {
            addCriterion("JGQH <", value, "jgqh");
            return (Criteria) this;
        }

        public Criteria andJgqhLessThanOrEqualTo(String value) {
            addCriterion("JGQH <=", value, "jgqh");
            return (Criteria) this;
        }

        public Criteria andJgqhLike(String value) {
            addCriterion("JGQH like", value, "jgqh");
            return (Criteria) this;
        }

        public Criteria andJgqhNotLike(String value) {
            addCriterion("JGQH not like", value, "jgqh");
            return (Criteria) this;
        }

        public Criteria andJgqhIn(List<String> values) {
            addCriterion("JGQH in", values, "jgqh");
            return (Criteria) this;
        }

        public Criteria andJgqhNotIn(List<String> values) {
            addCriterion("JGQH not in", values, "jgqh");
            return (Criteria) this;
        }

        public Criteria andJgqhBetween(String value1, String value2) {
            addCriterion("JGQH between", value1, value2, "jgqh");
            return (Criteria) this;
        }

        public Criteria andJgqhNotBetween(String value1, String value2) {
            addCriterion("JGQH not between", value1, value2, "jgqh");
            return (Criteria) this;
        }

        public Criteria andCsqhIsNull() {
            addCriterion("CSQH is null");
            return (Criteria) this;
        }

        public Criteria andCsqhIsNotNull() {
            addCriterion("CSQH is not null");
            return (Criteria) this;
        }

        public Criteria andCsqhEqualTo(String value) {
            addCriterion("CSQH =", value, "csqh");
            return (Criteria) this;
        }

        public Criteria andCsqhNotEqualTo(String value) {
            addCriterion("CSQH <>", value, "csqh");
            return (Criteria) this;
        }

        public Criteria andCsqhGreaterThan(String value) {
            addCriterion("CSQH >", value, "csqh");
            return (Criteria) this;
        }

        public Criteria andCsqhGreaterThanOrEqualTo(String value) {
            addCriterion("CSQH >=", value, "csqh");
            return (Criteria) this;
        }

        public Criteria andCsqhLessThan(String value) {
            addCriterion("CSQH <", value, "csqh");
            return (Criteria) this;
        }

        public Criteria andCsqhLessThanOrEqualTo(String value) {
            addCriterion("CSQH <=", value, "csqh");
            return (Criteria) this;
        }

        public Criteria andCsqhLike(String value) {
            addCriterion("CSQH like", value, "csqh");
            return (Criteria) this;
        }

        public Criteria andCsqhNotLike(String value) {
            addCriterion("CSQH not like", value, "csqh");
            return (Criteria) this;
        }

        public Criteria andCsqhIn(List<String> values) {
            addCriterion("CSQH in", values, "csqh");
            return (Criteria) this;
        }

        public Criteria andCsqhNotIn(List<String> values) {
            addCriterion("CSQH not in", values, "csqh");
            return (Criteria) this;
        }

        public Criteria andCsqhBetween(String value1, String value2) {
            addCriterion("CSQH between", value1, value2, "csqh");
            return (Criteria) this;
        }

        public Criteria andCsqhNotBetween(String value1, String value2) {
            addCriterion("CSQH not between", value1, value2, "csqh");
            return (Criteria) this;
        }

        public Criteria andJtqhIsNull() {
            addCriterion("JTQH is null");
            return (Criteria) this;
        }

        public Criteria andJtqhIsNotNull() {
            addCriterion("JTQH is not null");
            return (Criteria) this;
        }

        public Criteria andJtqhEqualTo(String value) {
            addCriterion("JTQH =", value, "jtqh");
            return (Criteria) this;
        }

        public Criteria andJtqhNotEqualTo(String value) {
            addCriterion("JTQH <>", value, "jtqh");
            return (Criteria) this;
        }

        public Criteria andJtqhGreaterThan(String value) {
            addCriterion("JTQH >", value, "jtqh");
            return (Criteria) this;
        }

        public Criteria andJtqhGreaterThanOrEqualTo(String value) {
            addCriterion("JTQH >=", value, "jtqh");
            return (Criteria) this;
        }

        public Criteria andJtqhLessThan(String value) {
            addCriterion("JTQH <", value, "jtqh");
            return (Criteria) this;
        }

        public Criteria andJtqhLessThanOrEqualTo(String value) {
            addCriterion("JTQH <=", value, "jtqh");
            return (Criteria) this;
        }

        public Criteria andJtqhLike(String value) {
            addCriterion("JTQH like", value, "jtqh");
            return (Criteria) this;
        }

        public Criteria andJtqhNotLike(String value) {
            addCriterion("JTQH not like", value, "jtqh");
            return (Criteria) this;
        }

        public Criteria andJtqhIn(List<String> values) {
            addCriterion("JTQH in", values, "jtqh");
            return (Criteria) this;
        }

        public Criteria andJtqhNotIn(List<String> values) {
            addCriterion("JTQH not in", values, "jtqh");
            return (Criteria) this;
        }

        public Criteria andJtqhBetween(String value1, String value2) {
            addCriterion("JTQH between", value1, value2, "jtqh");
            return (Criteria) this;
        }

        public Criteria andJtqhNotBetween(String value1, String value2) {
            addCriterion("JTQH not between", value1, value2, "jtqh");
            return (Criteria) this;
        }

        public Criteria andJtmxIsNull() {
            addCriterion("JTMX is null");
            return (Criteria) this;
        }

        public Criteria andJtmxIsNotNull() {
            addCriterion("JTMX is not null");
            return (Criteria) this;
        }

        public Criteria andJtmxEqualTo(String value) {
            addCriterion("JTMX =", value, "jtmx");
            return (Criteria) this;
        }

        public Criteria andJtmxNotEqualTo(String value) {
            addCriterion("JTMX <>", value, "jtmx");
            return (Criteria) this;
        }

        public Criteria andJtmxGreaterThan(String value) {
            addCriterion("JTMX >", value, "jtmx");
            return (Criteria) this;
        }

        public Criteria andJtmxGreaterThanOrEqualTo(String value) {
            addCriterion("JTMX >=", value, "jtmx");
            return (Criteria) this;
        }

        public Criteria andJtmxLessThan(String value) {
            addCriterion("JTMX <", value, "jtmx");
            return (Criteria) this;
        }

        public Criteria andJtmxLessThanOrEqualTo(String value) {
            addCriterion("JTMX <=", value, "jtmx");
            return (Criteria) this;
        }

        public Criteria andJtmxLike(String value) {
            addCriterion("JTMX like", value, "jtmx");
            return (Criteria) this;
        }

        public Criteria andJtmxNotLike(String value) {
            addCriterion("JTMX not like", value, "jtmx");
            return (Criteria) this;
        }

        public Criteria andJtmxIn(List<String> values) {
            addCriterion("JTMX in", values, "jtmx");
            return (Criteria) this;
        }

        public Criteria andJtmxNotIn(List<String> values) {
            addCriterion("JTMX not in", values, "jtmx");
            return (Criteria) this;
        }

        public Criteria andJtmxBetween(String value1, String value2) {
            addCriterion("JTMX between", value1, value2, "jtmx");
            return (Criteria) this;
        }

        public Criteria andJtmxNotBetween(String value1, String value2) {
            addCriterion("JTMX not between", value1, value2, "jtmx");
            return (Criteria) this;
        }

        public Criteria andHjqh1IsNull() {
            addCriterion("HJQH1 is null");
            return (Criteria) this;
        }

        public Criteria andHjqh1IsNotNull() {
            addCriterion("HJQH1 is not null");
            return (Criteria) this;
        }

        public Criteria andHjqh1EqualTo(String value) {
            addCriterion("HJQH1 =", value, "hjqh1");
            return (Criteria) this;
        }

        public Criteria andHjqh1NotEqualTo(String value) {
            addCriterion("HJQH1 <>", value, "hjqh1");
            return (Criteria) this;
        }

        public Criteria andHjqh1GreaterThan(String value) {
            addCriterion("HJQH1 >", value, "hjqh1");
            return (Criteria) this;
        }

        public Criteria andHjqh1GreaterThanOrEqualTo(String value) {
            addCriterion("HJQH1 >=", value, "hjqh1");
            return (Criteria) this;
        }

        public Criteria andHjqh1LessThan(String value) {
            addCriterion("HJQH1 <", value, "hjqh1");
            return (Criteria) this;
        }

        public Criteria andHjqh1LessThanOrEqualTo(String value) {
            addCriterion("HJQH1 <=", value, "hjqh1");
            return (Criteria) this;
        }

        public Criteria andHjqh1Like(String value) {
            addCriterion("HJQH1 like", value, "hjqh1");
            return (Criteria) this;
        }

        public Criteria andHjqh1NotLike(String value) {
            addCriterion("HJQH1 not like", value, "hjqh1");
            return (Criteria) this;
        }

        public Criteria andHjqh1In(List<String> values) {
            addCriterion("HJQH1 in", values, "hjqh1");
            return (Criteria) this;
        }

        public Criteria andHjqh1NotIn(List<String> values) {
            addCriterion("HJQH1 not in", values, "hjqh1");
            return (Criteria) this;
        }

        public Criteria andHjqh1Between(String value1, String value2) {
            addCriterion("HJQH1 between", value1, value2, "hjqh1");
            return (Criteria) this;
        }

        public Criteria andHjqh1NotBetween(String value1, String value2) {
            addCriterion("HJQH1 not between", value1, value2, "hjqh1");
            return (Criteria) this;
        }

        public Criteria andHjqh2IsNull() {
            addCriterion("HJQH2 is null");
            return (Criteria) this;
        }

        public Criteria andHjqh2IsNotNull() {
            addCriterion("HJQH2 is not null");
            return (Criteria) this;
        }

        public Criteria andHjqh2EqualTo(String value) {
            addCriterion("HJQH2 =", value, "hjqh2");
            return (Criteria) this;
        }

        public Criteria andHjqh2NotEqualTo(String value) {
            addCriterion("HJQH2 <>", value, "hjqh2");
            return (Criteria) this;
        }

        public Criteria andHjqh2GreaterThan(String value) {
            addCriterion("HJQH2 >", value, "hjqh2");
            return (Criteria) this;
        }

        public Criteria andHjqh2GreaterThanOrEqualTo(String value) {
            addCriterion("HJQH2 >=", value, "hjqh2");
            return (Criteria) this;
        }

        public Criteria andHjqh2LessThan(String value) {
            addCriterion("HJQH2 <", value, "hjqh2");
            return (Criteria) this;
        }

        public Criteria andHjqh2LessThanOrEqualTo(String value) {
            addCriterion("HJQH2 <=", value, "hjqh2");
            return (Criteria) this;
        }

        public Criteria andHjqh2Like(String value) {
            addCriterion("HJQH2 like", value, "hjqh2");
            return (Criteria) this;
        }

        public Criteria andHjqh2NotLike(String value) {
            addCriterion("HJQH2 not like", value, "hjqh2");
            return (Criteria) this;
        }

        public Criteria andHjqh2In(List<String> values) {
            addCriterion("HJQH2 in", values, "hjqh2");
            return (Criteria) this;
        }

        public Criteria andHjqh2NotIn(List<String> values) {
            addCriterion("HJQH2 not in", values, "hjqh2");
            return (Criteria) this;
        }

        public Criteria andHjqh2Between(String value1, String value2) {
            addCriterion("HJQH2 between", value1, value2, "hjqh2");
            return (Criteria) this;
        }

        public Criteria andHjqh2NotBetween(String value1, String value2) {
            addCriterion("HJQH2 not between", value1, value2, "hjqh2");
            return (Criteria) this;
        }

        public Criteria andHjmxIsNull() {
            addCriterion("HJMX is null");
            return (Criteria) this;
        }

        public Criteria andHjmxIsNotNull() {
            addCriterion("HJMX is not null");
            return (Criteria) this;
        }

        public Criteria andHjmxEqualTo(String value) {
            addCriterion("HJMX =", value, "hjmx");
            return (Criteria) this;
        }

        public Criteria andHjmxNotEqualTo(String value) {
            addCriterion("HJMX <>", value, "hjmx");
            return (Criteria) this;
        }

        public Criteria andHjmxGreaterThan(String value) {
            addCriterion("HJMX >", value, "hjmx");
            return (Criteria) this;
        }

        public Criteria andHjmxGreaterThanOrEqualTo(String value) {
            addCriterion("HJMX >=", value, "hjmx");
            return (Criteria) this;
        }

        public Criteria andHjmxLessThan(String value) {
            addCriterion("HJMX <", value, "hjmx");
            return (Criteria) this;
        }

        public Criteria andHjmxLessThanOrEqualTo(String value) {
            addCriterion("HJMX <=", value, "hjmx");
            return (Criteria) this;
        }

        public Criteria andHjmxLike(String value) {
            addCriterion("HJMX like", value, "hjmx");
            return (Criteria) this;
        }

        public Criteria andHjmxNotLike(String value) {
            addCriterion("HJMX not like", value, "hjmx");
            return (Criteria) this;
        }

        public Criteria andHjmxIn(List<String> values) {
            addCriterion("HJMX in", values, "hjmx");
            return (Criteria) this;
        }

        public Criteria andHjmxNotIn(List<String> values) {
            addCriterion("HJMX not in", values, "hjmx");
            return (Criteria) this;
        }

        public Criteria andHjmxBetween(String value1, String value2) {
            addCriterion("HJMX between", value1, value2, "hjmx");
            return (Criteria) this;
        }

        public Criteria andHjmxNotBetween(String value1, String value2) {
            addCriterion("HJMX not between", value1, value2, "hjmx");
            return (Criteria) this;
        }

        public Criteria andHklxIsNull() {
            addCriterion("HKLX is null");
            return (Criteria) this;
        }

        public Criteria andHklxIsNotNull() {
            addCriterion("HKLX is not null");
            return (Criteria) this;
        }

        public Criteria andHklxEqualTo(String value) {
            addCriterion("HKLX =", value, "hklx");
            return (Criteria) this;
        }

        public Criteria andHklxNotEqualTo(String value) {
            addCriterion("HKLX <>", value, "hklx");
            return (Criteria) this;
        }

        public Criteria andHklxGreaterThan(String value) {
            addCriterion("HKLX >", value, "hklx");
            return (Criteria) this;
        }

        public Criteria andHklxGreaterThanOrEqualTo(String value) {
            addCriterion("HKLX >=", value, "hklx");
            return (Criteria) this;
        }

        public Criteria andHklxLessThan(String value) {
            addCriterion("HKLX <", value, "hklx");
            return (Criteria) this;
        }

        public Criteria andHklxLessThanOrEqualTo(String value) {
            addCriterion("HKLX <=", value, "hklx");
            return (Criteria) this;
        }

        public Criteria andHklxLike(String value) {
            addCriterion("HKLX like", value, "hklx");
            return (Criteria) this;
        }

        public Criteria andHklxNotLike(String value) {
            addCriterion("HKLX not like", value, "hklx");
            return (Criteria) this;
        }

        public Criteria andHklxIn(List<String> values) {
            addCriterion("HKLX in", values, "hklx");
            return (Criteria) this;
        }

        public Criteria andHklxNotIn(List<String> values) {
            addCriterion("HKLX not in", values, "hklx");
            return (Criteria) this;
        }

        public Criteria andHklxBetween(String value1, String value2) {
            addCriterion("HKLX between", value1, value2, "hklx");
            return (Criteria) this;
        }

        public Criteria andHklxNotBetween(String value1, String value2) {
            addCriterion("HKLX not between", value1, value2, "hklx");
            return (Criteria) this;
        }

        public Criteria andBhmIsNull() {
            addCriterion("bhm is null");
            return (Criteria) this;
        }

        public Criteria andBhmIsNotNull() {
            addCriterion("bhm is not null");
            return (Criteria) this;
        }

        public Criteria andBhmEqualTo(String value) {
            addCriterion("bhm =", value, "bhm");
            return (Criteria) this;
        }

        public Criteria andBhmNotEqualTo(String value) {
            addCriterion("bhm <>", value, "bhm");
            return (Criteria) this;
        }

        public Criteria andBhmGreaterThan(String value) {
            addCriterion("bhm >", value, "bhm");
            return (Criteria) this;
        }

        public Criteria andBhmGreaterThanOrEqualTo(String value) {
            addCriterion("bhm >=", value, "bhm");
            return (Criteria) this;
        }

        public Criteria andBhmLessThan(String value) {
            addCriterion("bhm <", value, "bhm");
            return (Criteria) this;
        }

        public Criteria andBhmLessThanOrEqualTo(String value) {
            addCriterion("bhm <=", value, "bhm");
            return (Criteria) this;
        }

        public Criteria andBhmLike(String value) {
            addCriterion("bhm like", value, "bhm");
            return (Criteria) this;
        }

        public Criteria andBhmNotLike(String value) {
            addCriterion("bhm not like", value, "bhm");
            return (Criteria) this;
        }

        public Criteria andBhmIn(List<String> values) {
            addCriterion("bhm in", values, "bhm");
            return (Criteria) this;
        }

        public Criteria andBhmNotIn(List<String> values) {
            addCriterion("bhm not in", values, "bhm");
            return (Criteria) this;
        }

        public Criteria andBhmBetween(String value1, String value2) {
            addCriterion("bhm between", value1, value2, "bhm");
            return (Criteria) this;
        }

        public Criteria andBhmNotBetween(String value1, String value2) {
            addCriterion("bhm not between", value1, value2, "bhm");
            return (Criteria) this;
        }

        public Criteria andQrqIsNull() {
            addCriterion("qrq is null");
            return (Criteria) this;
        }

        public Criteria andQrqIsNotNull() {
            addCriterion("qrq is not null");
            return (Criteria) this;
        }

        public Criteria andQrqEqualTo(Date value) {
            addCriterion("qrq =", value, "qrq");
            return (Criteria) this;
        }

        public Criteria andQrqNotEqualTo(Date value) {
            addCriterion("qrq <>", value, "qrq");
            return (Criteria) this;
        }

        public Criteria andQrqGreaterThan(Date value) {
            addCriterion("qrq >", value, "qrq");
            return (Criteria) this;
        }

        public Criteria andQrqGreaterThanOrEqualTo(Date value) {
            addCriterion("qrq >=", value, "qrq");
            return (Criteria) this;
        }

        public Criteria andQrqLessThan(Date value) {
            addCriterion("qrq <", value, "qrq");
            return (Criteria) this;
        }

        public Criteria andQrqLessThanOrEqualTo(Date value) {
            addCriterion("qrq <=", value, "qrq");
            return (Criteria) this;
        }

        public Criteria andQrqIn(List<Date> values) {
            addCriterion("qrq in", values, "qrq");
            return (Criteria) this;
        }

        public Criteria andQrqNotIn(List<Date> values) {
            addCriterion("qrq not in", values, "qrq");
            return (Criteria) this;
        }

        public Criteria andQrqBetween(Date value1, Date value2) {
            addCriterion("qrq between", value1, value2, "qrq");
            return (Criteria) this;
        }

        public Criteria andQrqNotBetween(Date value1, Date value2) {
            addCriterion("qrq not between", value1, value2, "qrq");
            return (Criteria) this;
        }

        public Criteria andZrqIsNull() {
            addCriterion("zrq is null");
            return (Criteria) this;
        }

        public Criteria andZrqIsNotNull() {
            addCriterion("zrq is not null");
            return (Criteria) this;
        }

        public Criteria andZrqEqualTo(Date value) {
            addCriterion("zrq =", value, "zrq");
            return (Criteria) this;
        }

        public Criteria andZrqNotEqualTo(Date value) {
            addCriterion("zrq <>", value, "zrq");
            return (Criteria) this;
        }

        public Criteria andZrqGreaterThan(Date value) {
            addCriterion("zrq >", value, "zrq");
            return (Criteria) this;
        }

        public Criteria andZrqGreaterThanOrEqualTo(Date value) {
            addCriterion("zrq >=", value, "zrq");
            return (Criteria) this;
        }

        public Criteria andZrqLessThan(Date value) {
            addCriterion("zrq <", value, "zrq");
            return (Criteria) this;
        }

        public Criteria andZrqLessThanOrEqualTo(Date value) {
            addCriterion("zrq <=", value, "zrq");
            return (Criteria) this;
        }

        public Criteria andZrqIn(List<Date> values) {
            addCriterion("zrq in", values, "zrq");
            return (Criteria) this;
        }

        public Criteria andZrqNotIn(List<Date> values) {
            addCriterion("zrq not in", values, "zrq");
            return (Criteria) this;
        }

        public Criteria andZrqBetween(Date value1, Date value2) {
            addCriterion("zrq between", value1, value2, "zrq");
            return (Criteria) this;
        }

        public Criteria andZrqNotBetween(Date value1, Date value2) {
            addCriterion("zrq not between", value1, value2, "zrq");
            return (Criteria) this;
        }

        public Criteria andDwqhIsNull() {
            addCriterion("dwqh is null");
            return (Criteria) this;
        }

        public Criteria andDwqhIsNotNull() {
            addCriterion("dwqh is not null");
            return (Criteria) this;
        }

        public Criteria andDwqhEqualTo(String value) {
            addCriterion("dwqh =", value, "dwqh");
            return (Criteria) this;
        }

        public Criteria andDwqhNotEqualTo(String value) {
            addCriterion("dwqh <>", value, "dwqh");
            return (Criteria) this;
        }

        public Criteria andDwqhGreaterThan(String value) {
            addCriterion("dwqh >", value, "dwqh");
            return (Criteria) this;
        }

        public Criteria andDwqhGreaterThanOrEqualTo(String value) {
            addCriterion("dwqh >=", value, "dwqh");
            return (Criteria) this;
        }

        public Criteria andDwqhLessThan(String value) {
            addCriterion("dwqh <", value, "dwqh");
            return (Criteria) this;
        }

        public Criteria andDwqhLessThanOrEqualTo(String value) {
            addCriterion("dwqh <=", value, "dwqh");
            return (Criteria) this;
        }

        public Criteria andDwqhLike(String value) {
            addCriterion("dwqh like", value, "dwqh");
            return (Criteria) this;
        }

        public Criteria andDwqhNotLike(String value) {
            addCriterion("dwqh not like", value, "dwqh");
            return (Criteria) this;
        }

        public Criteria andDwqhIn(List<String> values) {
            addCriterion("dwqh in", values, "dwqh");
            return (Criteria) this;
        }

        public Criteria andDwqhNotIn(List<String> values) {
            addCriterion("dwqh not in", values, "dwqh");
            return (Criteria) this;
        }

        public Criteria andDwqhBetween(String value1, String value2) {
            addCriterion("dwqh between", value1, value2, "dwqh");
            return (Criteria) this;
        }

        public Criteria andDwqhNotBetween(String value1, String value2) {
            addCriterion("dwqh not between", value1, value2, "dwqh");
            return (Criteria) this;
        }

        public Criteria andDwmxIsNull() {
            addCriterion("dwmx is null");
            return (Criteria) this;
        }

        public Criteria andDwmxIsNotNull() {
            addCriterion("dwmx is not null");
            return (Criteria) this;
        }

        public Criteria andDwmxEqualTo(String value) {
            addCriterion("dwmx =", value, "dwmx");
            return (Criteria) this;
        }

        public Criteria andDwmxNotEqualTo(String value) {
            addCriterion("dwmx <>", value, "dwmx");
            return (Criteria) this;
        }

        public Criteria andDwmxGreaterThan(String value) {
            addCriterion("dwmx >", value, "dwmx");
            return (Criteria) this;
        }

        public Criteria andDwmxGreaterThanOrEqualTo(String value) {
            addCriterion("dwmx >=", value, "dwmx");
            return (Criteria) this;
        }

        public Criteria andDwmxLessThan(String value) {
            addCriterion("dwmx <", value, "dwmx");
            return (Criteria) this;
        }

        public Criteria andDwmxLessThanOrEqualTo(String value) {
            addCriterion("dwmx <=", value, "dwmx");
            return (Criteria) this;
        }

        public Criteria andDwmxLike(String value) {
            addCriterion("dwmx like", value, "dwmx");
            return (Criteria) this;
        }

        public Criteria andDwmxNotLike(String value) {
            addCriterion("dwmx not like", value, "dwmx");
            return (Criteria) this;
        }

        public Criteria andDwmxIn(List<String> values) {
            addCriterion("dwmx in", values, "dwmx");
            return (Criteria) this;
        }

        public Criteria andDwmxNotIn(List<String> values) {
            addCriterion("dwmx not in", values, "dwmx");
            return (Criteria) this;
        }

        public Criteria andDwmxBetween(String value1, String value2) {
            addCriterion("dwmx between", value1, value2, "dwmx");
            return (Criteria) this;
        }

        public Criteria andDwmxNotBetween(String value1, String value2) {
            addCriterion("dwmx not between", value1, value2, "dwmx");
            return (Criteria) this;
        }

        public Criteria andZyIsNull() {
            addCriterion("zy is null");
            return (Criteria) this;
        }

        public Criteria andZyIsNotNull() {
            addCriterion("zy is not null");
            return (Criteria) this;
        }

        public Criteria andZyEqualTo(String value) {
            addCriterion("zy =", value, "zy");
            return (Criteria) this;
        }

        public Criteria andZyNotEqualTo(String value) {
            addCriterion("zy <>", value, "zy");
            return (Criteria) this;
        }

        public Criteria andZyGreaterThan(String value) {
            addCriterion("zy >", value, "zy");
            return (Criteria) this;
        }

        public Criteria andZyGreaterThanOrEqualTo(String value) {
            addCriterion("zy >=", value, "zy");
            return (Criteria) this;
        }

        public Criteria andZyLessThan(String value) {
            addCriterion("zy <", value, "zy");
            return (Criteria) this;
        }

        public Criteria andZyLessThanOrEqualTo(String value) {
            addCriterion("zy <=", value, "zy");
            return (Criteria) this;
        }

        public Criteria andZyLike(String value) {
            addCriterion("zy like", value, "zy");
            return (Criteria) this;
        }

        public Criteria andZyNotLike(String value) {
            addCriterion("zy not like", value, "zy");
            return (Criteria) this;
        }

        public Criteria andZyIn(List<String> values) {
            addCriterion("zy in", values, "zy");
            return (Criteria) this;
        }

        public Criteria andZyNotIn(List<String> values) {
            addCriterion("zy not in", values, "zy");
            return (Criteria) this;
        }

        public Criteria andZyBetween(String value1, String value2) {
            addCriterion("zy between", value1, value2, "zy");
            return (Criteria) this;
        }

        public Criteria andZyNotBetween(String value1, String value2) {
            addCriterion("zy not between", value1, value2, "zy");
            return (Criteria) this;
        }

        public Criteria andZwIsNull() {
            addCriterion("zw is null");
            return (Criteria) this;
        }

        public Criteria andZwIsNotNull() {
            addCriterion("zw is not null");
            return (Criteria) this;
        }

        public Criteria andZwEqualTo(String value) {
            addCriterion("zw =", value, "zw");
            return (Criteria) this;
        }

        public Criteria andZwNotEqualTo(String value) {
            addCriterion("zw <>", value, "zw");
            return (Criteria) this;
        }

        public Criteria andZwGreaterThan(String value) {
            addCriterion("zw >", value, "zw");
            return (Criteria) this;
        }

        public Criteria andZwGreaterThanOrEqualTo(String value) {
            addCriterion("zw >=", value, "zw");
            return (Criteria) this;
        }

        public Criteria andZwLessThan(String value) {
            addCriterion("zw <", value, "zw");
            return (Criteria) this;
        }

        public Criteria andZwLessThanOrEqualTo(String value) {
            addCriterion("zw <=", value, "zw");
            return (Criteria) this;
        }

        public Criteria andZwLike(String value) {
            addCriterion("zw like", value, "zw");
            return (Criteria) this;
        }

        public Criteria andZwNotLike(String value) {
            addCriterion("zw not like", value, "zw");
            return (Criteria) this;
        }

        public Criteria andZwIn(List<String> values) {
            addCriterion("zw in", values, "zw");
            return (Criteria) this;
        }

        public Criteria andZwNotIn(List<String> values) {
            addCriterion("zw not in", values, "zw");
            return (Criteria) this;
        }

        public Criteria andZwBetween(String value1, String value2) {
            addCriterion("zw between", value1, value2, "zw");
            return (Criteria) this;
        }

        public Criteria andZwNotBetween(String value1, String value2) {
            addCriterion("zw not between", value1, value2, "zw");
            return (Criteria) this;
        }

        public Criteria andZcIsNull() {
            addCriterion("zc is null");
            return (Criteria) this;
        }

        public Criteria andZcIsNotNull() {
            addCriterion("zc is not null");
            return (Criteria) this;
        }

        public Criteria andZcEqualTo(String value) {
            addCriterion("zc =", value, "zc");
            return (Criteria) this;
        }

        public Criteria andZcNotEqualTo(String value) {
            addCriterion("zc <>", value, "zc");
            return (Criteria) this;
        }

        public Criteria andZcGreaterThan(String value) {
            addCriterion("zc >", value, "zc");
            return (Criteria) this;
        }

        public Criteria andZcGreaterThanOrEqualTo(String value) {
            addCriterion("zc >=", value, "zc");
            return (Criteria) this;
        }

        public Criteria andZcLessThan(String value) {
            addCriterion("zc <", value, "zc");
            return (Criteria) this;
        }

        public Criteria andZcLessThanOrEqualTo(String value) {
            addCriterion("zc <=", value, "zc");
            return (Criteria) this;
        }

        public Criteria andZcLike(String value) {
            addCriterion("zc like", value, "zc");
            return (Criteria) this;
        }

        public Criteria andZcNotLike(String value) {
            addCriterion("zc not like", value, "zc");
            return (Criteria) this;
        }

        public Criteria andZcIn(List<String> values) {
            addCriterion("zc in", values, "zc");
            return (Criteria) this;
        }

        public Criteria andZcNotIn(List<String> values) {
            addCriterion("zc not in", values, "zc");
            return (Criteria) this;
        }

        public Criteria andZcBetween(String value1, String value2) {
            addCriterion("zc between", value1, value2, "zc");
            return (Criteria) this;
        }

        public Criteria andZcNotBetween(String value1, String value2) {
            addCriterion("zc not between", value1, value2, "zc");
            return (Criteria) this;
        }

        public Criteria andGxIsNull() {
            addCriterion("gx is null");
            return (Criteria) this;
        }

        public Criteria andGxIsNotNull() {
            addCriterion("gx is not null");
            return (Criteria) this;
        }

        public Criteria andGxEqualTo(String value) {
            addCriterion("gx =", value, "gx");
            return (Criteria) this;
        }

        public Criteria andGxNotEqualTo(String value) {
            addCriterion("gx <>", value, "gx");
            return (Criteria) this;
        }

        public Criteria andGxGreaterThan(String value) {
            addCriterion("gx >", value, "gx");
            return (Criteria) this;
        }

        public Criteria andGxGreaterThanOrEqualTo(String value) {
            addCriterion("gx >=", value, "gx");
            return (Criteria) this;
        }

        public Criteria andGxLessThan(String value) {
            addCriterion("gx <", value, "gx");
            return (Criteria) this;
        }

        public Criteria andGxLessThanOrEqualTo(String value) {
            addCriterion("gx <=", value, "gx");
            return (Criteria) this;
        }

        public Criteria andGxLike(String value) {
            addCriterion("gx like", value, "gx");
            return (Criteria) this;
        }

        public Criteria andGxNotLike(String value) {
            addCriterion("gx not like", value, "gx");
            return (Criteria) this;
        }

        public Criteria andGxIn(List<String> values) {
            addCriterion("gx in", values, "gx");
            return (Criteria) this;
        }

        public Criteria andGxNotIn(List<String> values) {
            addCriterion("gx not in", values, "gx");
            return (Criteria) this;
        }

        public Criteria andGxBetween(String value1, String value2) {
            addCriterion("gx between", value1, value2, "gx");
            return (Criteria) this;
        }

        public Criteria andGxNotBetween(String value1, String value2) {
            addCriterion("gx not between", value1, value2, "gx");
            return (Criteria) this;
        }

        public Criteria andGxrxmIsNull() {
            addCriterion("gxrxm is null");
            return (Criteria) this;
        }

        public Criteria andGxrxmIsNotNull() {
            addCriterion("gxrxm is not null");
            return (Criteria) this;
        }

        public Criteria andGxrxmEqualTo(String value) {
            addCriterion("gxrxm =", value, "gxrxm");
            return (Criteria) this;
        }

        public Criteria andGxrxmNotEqualTo(String value) {
            addCriterion("gxrxm <>", value, "gxrxm");
            return (Criteria) this;
        }

        public Criteria andGxrxmGreaterThan(String value) {
            addCriterion("gxrxm >", value, "gxrxm");
            return (Criteria) this;
        }

        public Criteria andGxrxmGreaterThanOrEqualTo(String value) {
            addCriterion("gxrxm >=", value, "gxrxm");
            return (Criteria) this;
        }

        public Criteria andGxrxmLessThan(String value) {
            addCriterion("gxrxm <", value, "gxrxm");
            return (Criteria) this;
        }

        public Criteria andGxrxmLessThanOrEqualTo(String value) {
            addCriterion("gxrxm <=", value, "gxrxm");
            return (Criteria) this;
        }

        public Criteria andGxrxmLike(String value) {
            addCriterion("gxrxm like", value, "gxrxm");
            return (Criteria) this;
        }

        public Criteria andGxrxmNotLike(String value) {
            addCriterion("gxrxm not like", value, "gxrxm");
            return (Criteria) this;
        }

        public Criteria andGxrxmIn(List<String> values) {
            addCriterion("gxrxm in", values, "gxrxm");
            return (Criteria) this;
        }

        public Criteria andGxrxmNotIn(List<String> values) {
            addCriterion("gxrxm not in", values, "gxrxm");
            return (Criteria) this;
        }

        public Criteria andGxrxmBetween(String value1, String value2) {
            addCriterion("gxrxm between", value1, value2, "gxrxm");
            return (Criteria) this;
        }

        public Criteria andGxrxmNotBetween(String value1, String value2) {
            addCriterion("gxrxm not between", value1, value2, "gxrxm");
            return (Criteria) this;
        }

        public Criteria andGxrjtqhIsNull() {
            addCriterion("gxrjtqh is null");
            return (Criteria) this;
        }

        public Criteria andGxrjtqhIsNotNull() {
            addCriterion("gxrjtqh is not null");
            return (Criteria) this;
        }

        public Criteria andGxrjtqhEqualTo(String value) {
            addCriterion("gxrjtqh =", value, "gxrjtqh");
            return (Criteria) this;
        }

        public Criteria andGxrjtqhNotEqualTo(String value) {
            addCriterion("gxrjtqh <>", value, "gxrjtqh");
            return (Criteria) this;
        }

        public Criteria andGxrjtqhGreaterThan(String value) {
            addCriterion("gxrjtqh >", value, "gxrjtqh");
            return (Criteria) this;
        }

        public Criteria andGxrjtqhGreaterThanOrEqualTo(String value) {
            addCriterion("gxrjtqh >=", value, "gxrjtqh");
            return (Criteria) this;
        }

        public Criteria andGxrjtqhLessThan(String value) {
            addCriterion("gxrjtqh <", value, "gxrjtqh");
            return (Criteria) this;
        }

        public Criteria andGxrjtqhLessThanOrEqualTo(String value) {
            addCriterion("gxrjtqh <=", value, "gxrjtqh");
            return (Criteria) this;
        }

        public Criteria andGxrjtqhLike(String value) {
            addCriterion("gxrjtqh like", value, "gxrjtqh");
            return (Criteria) this;
        }

        public Criteria andGxrjtqhNotLike(String value) {
            addCriterion("gxrjtqh not like", value, "gxrjtqh");
            return (Criteria) this;
        }

        public Criteria andGxrjtqhIn(List<String> values) {
            addCriterion("gxrjtqh in", values, "gxrjtqh");
            return (Criteria) this;
        }

        public Criteria andGxrjtqhNotIn(List<String> values) {
            addCriterion("gxrjtqh not in", values, "gxrjtqh");
            return (Criteria) this;
        }

        public Criteria andGxrjtqhBetween(String value1, String value2) {
            addCriterion("gxrjtqh between", value1, value2, "gxrjtqh");
            return (Criteria) this;
        }

        public Criteria andGxrjtqhNotBetween(String value1, String value2) {
            addCriterion("gxrjtqh not between", value1, value2, "gxrjtqh");
            return (Criteria) this;
        }

        public Criteria andGxrjtmxIsNull() {
            addCriterion("gxrjtmx is null");
            return (Criteria) this;
        }

        public Criteria andGxrjtmxIsNotNull() {
            addCriterion("gxrjtmx is not null");
            return (Criteria) this;
        }

        public Criteria andGxrjtmxEqualTo(String value) {
            addCriterion("gxrjtmx =", value, "gxrjtmx");
            return (Criteria) this;
        }

        public Criteria andGxrjtmxNotEqualTo(String value) {
            addCriterion("gxrjtmx <>", value, "gxrjtmx");
            return (Criteria) this;
        }

        public Criteria andGxrjtmxGreaterThan(String value) {
            addCriterion("gxrjtmx >", value, "gxrjtmx");
            return (Criteria) this;
        }

        public Criteria andGxrjtmxGreaterThanOrEqualTo(String value) {
            addCriterion("gxrjtmx >=", value, "gxrjtmx");
            return (Criteria) this;
        }

        public Criteria andGxrjtmxLessThan(String value) {
            addCriterion("gxrjtmx <", value, "gxrjtmx");
            return (Criteria) this;
        }

        public Criteria andGxrjtmxLessThanOrEqualTo(String value) {
            addCriterion("gxrjtmx <=", value, "gxrjtmx");
            return (Criteria) this;
        }

        public Criteria andGxrjtmxLike(String value) {
            addCriterion("gxrjtmx like", value, "gxrjtmx");
            return (Criteria) this;
        }

        public Criteria andGxrjtmxNotLike(String value) {
            addCriterion("gxrjtmx not like", value, "gxrjtmx");
            return (Criteria) this;
        }

        public Criteria andGxrjtmxIn(List<String> values) {
            addCriterion("gxrjtmx in", values, "gxrjtmx");
            return (Criteria) this;
        }

        public Criteria andGxrjtmxNotIn(List<String> values) {
            addCriterion("gxrjtmx not in", values, "gxrjtmx");
            return (Criteria) this;
        }

        public Criteria andGxrjtmxBetween(String value1, String value2) {
            addCriterion("gxrjtmx between", value1, value2, "gxrjtmx");
            return (Criteria) this;
        }

        public Criteria andGxrjtmxNotBetween(String value1, String value2) {
            addCriterion("gxrjtmx not between", value1, value2, "gxrjtmx");
            return (Criteria) this;
        }

        public Criteria andGxrdwqhIsNull() {
            addCriterion("gxrdwqh is null");
            return (Criteria) this;
        }

        public Criteria andGxrdwqhIsNotNull() {
            addCriterion("gxrdwqh is not null");
            return (Criteria) this;
        }

        public Criteria andGxrdwqhEqualTo(String value) {
            addCriterion("gxrdwqh =", value, "gxrdwqh");
            return (Criteria) this;
        }

        public Criteria andGxrdwqhNotEqualTo(String value) {
            addCriterion("gxrdwqh <>", value, "gxrdwqh");
            return (Criteria) this;
        }

        public Criteria andGxrdwqhGreaterThan(String value) {
            addCriterion("gxrdwqh >", value, "gxrdwqh");
            return (Criteria) this;
        }

        public Criteria andGxrdwqhGreaterThanOrEqualTo(String value) {
            addCriterion("gxrdwqh >=", value, "gxrdwqh");
            return (Criteria) this;
        }

        public Criteria andGxrdwqhLessThan(String value) {
            addCriterion("gxrdwqh <", value, "gxrdwqh");
            return (Criteria) this;
        }

        public Criteria andGxrdwqhLessThanOrEqualTo(String value) {
            addCriterion("gxrdwqh <=", value, "gxrdwqh");
            return (Criteria) this;
        }

        public Criteria andGxrdwqhLike(String value) {
            addCriterion("gxrdwqh like", value, "gxrdwqh");
            return (Criteria) this;
        }

        public Criteria andGxrdwqhNotLike(String value) {
            addCriterion("gxrdwqh not like", value, "gxrdwqh");
            return (Criteria) this;
        }

        public Criteria andGxrdwqhIn(List<String> values) {
            addCriterion("gxrdwqh in", values, "gxrdwqh");
            return (Criteria) this;
        }

        public Criteria andGxrdwqhNotIn(List<String> values) {
            addCriterion("gxrdwqh not in", values, "gxrdwqh");
            return (Criteria) this;
        }

        public Criteria andGxrdwqhBetween(String value1, String value2) {
            addCriterion("gxrdwqh between", value1, value2, "gxrdwqh");
            return (Criteria) this;
        }

        public Criteria andGxrdwqhNotBetween(String value1, String value2) {
            addCriterion("gxrdwqh not between", value1, value2, "gxrdwqh");
            return (Criteria) this;
        }

        public Criteria andGxrzyIsNull() {
            addCriterion("gxrzy is null");
            return (Criteria) this;
        }

        public Criteria andGxrzyIsNotNull() {
            addCriterion("gxrzy is not null");
            return (Criteria) this;
        }

        public Criteria andGxrzyEqualTo(String value) {
            addCriterion("gxrzy =", value, "gxrzy");
            return (Criteria) this;
        }

        public Criteria andGxrzyNotEqualTo(String value) {
            addCriterion("gxrzy <>", value, "gxrzy");
            return (Criteria) this;
        }

        public Criteria andGxrzyGreaterThan(String value) {
            addCriterion("gxrzy >", value, "gxrzy");
            return (Criteria) this;
        }

        public Criteria andGxrzyGreaterThanOrEqualTo(String value) {
            addCriterion("gxrzy >=", value, "gxrzy");
            return (Criteria) this;
        }

        public Criteria andGxrzyLessThan(String value) {
            addCriterion("gxrzy <", value, "gxrzy");
            return (Criteria) this;
        }

        public Criteria andGxrzyLessThanOrEqualTo(String value) {
            addCriterion("gxrzy <=", value, "gxrzy");
            return (Criteria) this;
        }

        public Criteria andGxrzyLike(String value) {
            addCriterion("gxrzy like", value, "gxrzy");
            return (Criteria) this;
        }

        public Criteria andGxrzyNotLike(String value) {
            addCriterion("gxrzy not like", value, "gxrzy");
            return (Criteria) this;
        }

        public Criteria andGxrzyIn(List<String> values) {
            addCriterion("gxrzy in", values, "gxrzy");
            return (Criteria) this;
        }

        public Criteria andGxrzyNotIn(List<String> values) {
            addCriterion("gxrzy not in", values, "gxrzy");
            return (Criteria) this;
        }

        public Criteria andGxrzyBetween(String value1, String value2) {
            addCriterion("gxrzy between", value1, value2, "gxrzy");
            return (Criteria) this;
        }

        public Criteria andGxrzyNotBetween(String value1, String value2) {
            addCriterion("gxrzy not between", value1, value2, "gxrzy");
            return (Criteria) this;
        }

        public Criteria andGxrzwIsNull() {
            addCriterion("gxrzw is null");
            return (Criteria) this;
        }

        public Criteria andGxrzwIsNotNull() {
            addCriterion("gxrzw is not null");
            return (Criteria) this;
        }

        public Criteria andGxrzwEqualTo(String value) {
            addCriterion("gxrzw =", value, "gxrzw");
            return (Criteria) this;
        }

        public Criteria andGxrzwNotEqualTo(String value) {
            addCriterion("gxrzw <>", value, "gxrzw");
            return (Criteria) this;
        }

        public Criteria andGxrzwGreaterThan(String value) {
            addCriterion("gxrzw >", value, "gxrzw");
            return (Criteria) this;
        }

        public Criteria andGxrzwGreaterThanOrEqualTo(String value) {
            addCriterion("gxrzw >=", value, "gxrzw");
            return (Criteria) this;
        }

        public Criteria andGxrzwLessThan(String value) {
            addCriterion("gxrzw <", value, "gxrzw");
            return (Criteria) this;
        }

        public Criteria andGxrzwLessThanOrEqualTo(String value) {
            addCriterion("gxrzw <=", value, "gxrzw");
            return (Criteria) this;
        }

        public Criteria andGxrzwLike(String value) {
            addCriterion("gxrzw like", value, "gxrzw");
            return (Criteria) this;
        }

        public Criteria andGxrzwNotLike(String value) {
            addCriterion("gxrzw not like", value, "gxrzw");
            return (Criteria) this;
        }

        public Criteria andGxrzwIn(List<String> values) {
            addCriterion("gxrzw in", values, "gxrzw");
            return (Criteria) this;
        }

        public Criteria andGxrzwNotIn(List<String> values) {
            addCriterion("gxrzw not in", values, "gxrzw");
            return (Criteria) this;
        }

        public Criteria andGxrzwBetween(String value1, String value2) {
            addCriterion("gxrzw between", value1, value2, "gxrzw");
            return (Criteria) this;
        }

        public Criteria andGxrzwNotBetween(String value1, String value2) {
            addCriterion("gxrzw not between", value1, value2, "gxrzw");
            return (Criteria) this;
        }

        public Criteria andGxrzjlxIsNull() {
            addCriterion("gxrzjlx is null");
            return (Criteria) this;
        }

        public Criteria andGxrzjlxIsNotNull() {
            addCriterion("gxrzjlx is not null");
            return (Criteria) this;
        }

        public Criteria andGxrzjlxEqualTo(String value) {
            addCriterion("gxrzjlx =", value, "gxrzjlx");
            return (Criteria) this;
        }

        public Criteria andGxrzjlxNotEqualTo(String value) {
            addCriterion("gxrzjlx <>", value, "gxrzjlx");
            return (Criteria) this;
        }

        public Criteria andGxrzjlxGreaterThan(String value) {
            addCriterion("gxrzjlx >", value, "gxrzjlx");
            return (Criteria) this;
        }

        public Criteria andGxrzjlxGreaterThanOrEqualTo(String value) {
            addCriterion("gxrzjlx >=", value, "gxrzjlx");
            return (Criteria) this;
        }

        public Criteria andGxrzjlxLessThan(String value) {
            addCriterion("gxrzjlx <", value, "gxrzjlx");
            return (Criteria) this;
        }

        public Criteria andGxrzjlxLessThanOrEqualTo(String value) {
            addCriterion("gxrzjlx <=", value, "gxrzjlx");
            return (Criteria) this;
        }

        public Criteria andGxrzjlxLike(String value) {
            addCriterion("gxrzjlx like", value, "gxrzjlx");
            return (Criteria) this;
        }

        public Criteria andGxrzjlxNotLike(String value) {
            addCriterion("gxrzjlx not like", value, "gxrzjlx");
            return (Criteria) this;
        }

        public Criteria andGxrzjlxIn(List<String> values) {
            addCriterion("gxrzjlx in", values, "gxrzjlx");
            return (Criteria) this;
        }

        public Criteria andGxrzjlxNotIn(List<String> values) {
            addCriterion("gxrzjlx not in", values, "gxrzjlx");
            return (Criteria) this;
        }

        public Criteria andGxrzjlxBetween(String value1, String value2) {
            addCriterion("gxrzjlx between", value1, value2, "gxrzjlx");
            return (Criteria) this;
        }

        public Criteria andGxrzjlxNotBetween(String value1, String value2) {
            addCriterion("gxrzjlx not between", value1, value2, "gxrzjlx");
            return (Criteria) this;
        }

        public Criteria andGxrzjhmIsNull() {
            addCriterion("gxrzjhm is null");
            return (Criteria) this;
        }

        public Criteria andGxrzjhmIsNotNull() {
            addCriterion("gxrzjhm is not null");
            return (Criteria) this;
        }

        public Criteria andGxrzjhmEqualTo(String value) {
            addCriterion("gxrzjhm =", value, "gxrzjhm");
            return (Criteria) this;
        }

        public Criteria andGxrzjhmNotEqualTo(String value) {
            addCriterion("gxrzjhm <>", value, "gxrzjhm");
            return (Criteria) this;
        }

        public Criteria andGxrzjhmGreaterThan(String value) {
            addCriterion("gxrzjhm >", value, "gxrzjhm");
            return (Criteria) this;
        }

        public Criteria andGxrzjhmGreaterThanOrEqualTo(String value) {
            addCriterion("gxrzjhm >=", value, "gxrzjhm");
            return (Criteria) this;
        }

        public Criteria andGxrzjhmLessThan(String value) {
            addCriterion("gxrzjhm <", value, "gxrzjhm");
            return (Criteria) this;
        }

        public Criteria andGxrzjhmLessThanOrEqualTo(String value) {
            addCriterion("gxrzjhm <=", value, "gxrzjhm");
            return (Criteria) this;
        }

        public Criteria andGxrzjhmLike(String value) {
            addCriterion("gxrzjhm like", value, "gxrzjhm");
            return (Criteria) this;
        }

        public Criteria andGxrzjhmNotLike(String value) {
            addCriterion("gxrzjhm not like", value, "gxrzjhm");
            return (Criteria) this;
        }

        public Criteria andGxrzjhmIn(List<String> values) {
            addCriterion("gxrzjhm in", values, "gxrzjhm");
            return (Criteria) this;
        }

        public Criteria andGxrzjhmNotIn(List<String> values) {
            addCriterion("gxrzjhm not in", values, "gxrzjhm");
            return (Criteria) this;
        }

        public Criteria andGxrzjhmBetween(String value1, String value2) {
            addCriterion("gxrzjhm between", value1, value2, "gxrzjhm");
            return (Criteria) this;
        }

        public Criteria andGxrzjhmNotBetween(String value1, String value2) {
            addCriterion("gxrzjhm not between", value1, value2, "gxrzjhm");
            return (Criteria) this;
        }

        public Criteria andDhIsNull() {
            addCriterion("dh is null");
            return (Criteria) this;
        }

        public Criteria andDhIsNotNull() {
            addCriterion("dh is not null");
            return (Criteria) this;
        }

        public Criteria andDhEqualTo(String value) {
            addCriterion("dh =", value, "dh");
            return (Criteria) this;
        }

        public Criteria andDhNotEqualTo(String value) {
            addCriterion("dh <>", value, "dh");
            return (Criteria) this;
        }

        public Criteria andDhGreaterThan(String value) {
            addCriterion("dh >", value, "dh");
            return (Criteria) this;
        }

        public Criteria andDhGreaterThanOrEqualTo(String value) {
            addCriterion("dh >=", value, "dh");
            return (Criteria) this;
        }

        public Criteria andDhLessThan(String value) {
            addCriterion("dh <", value, "dh");
            return (Criteria) this;
        }

        public Criteria andDhLessThanOrEqualTo(String value) {
            addCriterion("dh <=", value, "dh");
            return (Criteria) this;
        }

        public Criteria andDhLike(String value) {
            addCriterion("dh like", value, "dh");
            return (Criteria) this;
        }

        public Criteria andDhNotLike(String value) {
            addCriterion("dh not like", value, "dh");
            return (Criteria) this;
        }

        public Criteria andDhIn(List<String> values) {
            addCriterion("dh in", values, "dh");
            return (Criteria) this;
        }

        public Criteria andDhNotIn(List<String> values) {
            addCriterion("dh not in", values, "dh");
            return (Criteria) this;
        }

        public Criteria andDhBetween(String value1, String value2) {
            addCriterion("dh between", value1, value2, "dh");
            return (Criteria) this;
        }

        public Criteria andDhNotBetween(String value1, String value2) {
            addCriterion("dh not between", value1, value2, "dh");
            return (Criteria) this;
        }

        public Criteria andZlxrIsNull() {
            addCriterion("zlxr is null");
            return (Criteria) this;
        }

        public Criteria andZlxrIsNotNull() {
            addCriterion("zlxr is not null");
            return (Criteria) this;
        }

        public Criteria andZlxrEqualTo(String value) {
            addCriterion("zlxr =", value, "zlxr");
            return (Criteria) this;
        }

        public Criteria andZlxrNotEqualTo(String value) {
            addCriterion("zlxr <>", value, "zlxr");
            return (Criteria) this;
        }

        public Criteria andZlxrGreaterThan(String value) {
            addCriterion("zlxr >", value, "zlxr");
            return (Criteria) this;
        }

        public Criteria andZlxrGreaterThanOrEqualTo(String value) {
            addCriterion("zlxr >=", value, "zlxr");
            return (Criteria) this;
        }

        public Criteria andZlxrLessThan(String value) {
            addCriterion("zlxr <", value, "zlxr");
            return (Criteria) this;
        }

        public Criteria andZlxrLessThanOrEqualTo(String value) {
            addCriterion("zlxr <=", value, "zlxr");
            return (Criteria) this;
        }

        public Criteria andZlxrLike(String value) {
            addCriterion("zlxr like", value, "zlxr");
            return (Criteria) this;
        }

        public Criteria andZlxrNotLike(String value) {
            addCriterion("zlxr not like", value, "zlxr");
            return (Criteria) this;
        }

        public Criteria andZlxrIn(List<String> values) {
            addCriterion("zlxr in", values, "zlxr");
            return (Criteria) this;
        }

        public Criteria andZlxrNotIn(List<String> values) {
            addCriterion("zlxr not in", values, "zlxr");
            return (Criteria) this;
        }

        public Criteria andZlxrBetween(String value1, String value2) {
            addCriterion("zlxr between", value1, value2, "zlxr");
            return (Criteria) this;
        }

        public Criteria andZlxrNotBetween(String value1, String value2) {
            addCriterion("zlxr not between", value1, value2, "zlxr");
            return (Criteria) this;
        }

        public Criteria andWcnfzIsNull() {
            addCriterion("wcnfz is null");
            return (Criteria) this;
        }

        public Criteria andWcnfzIsNotNull() {
            addCriterion("wcnfz is not null");
            return (Criteria) this;
        }

        public Criteria andWcnfzEqualTo(String value) {
            addCriterion("wcnfz =", value, "wcnfz");
            return (Criteria) this;
        }

        public Criteria andWcnfzNotEqualTo(String value) {
            addCriterion("wcnfz <>", value, "wcnfz");
            return (Criteria) this;
        }

        public Criteria andWcnfzGreaterThan(String value) {
            addCriterion("wcnfz >", value, "wcnfz");
            return (Criteria) this;
        }

        public Criteria andWcnfzGreaterThanOrEqualTo(String value) {
            addCriterion("wcnfz >=", value, "wcnfz");
            return (Criteria) this;
        }

        public Criteria andWcnfzLessThan(String value) {
            addCriterion("wcnfz <", value, "wcnfz");
            return (Criteria) this;
        }

        public Criteria andWcnfzLessThanOrEqualTo(String value) {
            addCriterion("wcnfz <=", value, "wcnfz");
            return (Criteria) this;
        }

        public Criteria andWcnfzLike(String value) {
            addCriterion("wcnfz like", value, "wcnfz");
            return (Criteria) this;
        }

        public Criteria andWcnfzNotLike(String value) {
            addCriterion("wcnfz not like", value, "wcnfz");
            return (Criteria) this;
        }

        public Criteria andWcnfzIn(List<String> values) {
            addCriterion("wcnfz in", values, "wcnfz");
            return (Criteria) this;
        }

        public Criteria andWcnfzNotIn(List<String> values) {
            addCriterion("wcnfz not in", values, "wcnfz");
            return (Criteria) this;
        }

        public Criteria andWcnfzBetween(String value1, String value2) {
            addCriterion("wcnfz between", value1, value2, "wcnfz");
            return (Criteria) this;
        }

        public Criteria andWcnfzNotBetween(String value1, String value2) {
            addCriterion("wcnfz not between", value1, value2, "wcnfz");
            return (Criteria) this;
        }

        public Criteria andJyrqIsNull() {
            addCriterion("JYRQ is null");
            return (Criteria) this;
        }

        public Criteria andJyrqIsNotNull() {
            addCriterion("JYRQ is not null");
            return (Criteria) this;
        }

        public Criteria andJyrqEqualTo(Date value) {
            addCriterion("JYRQ =", value, "jyrq");
            return (Criteria) this;
        }

        public Criteria andJyrqNotEqualTo(Date value) {
            addCriterion("JYRQ <>", value, "jyrq");
            return (Criteria) this;
        }

        public Criteria andJyrqGreaterThan(Date value) {
            addCriterion("JYRQ >", value, "jyrq");
            return (Criteria) this;
        }

        public Criteria andJyrqGreaterThanOrEqualTo(Date value) {
            addCriterion("JYRQ >=", value, "jyrq");
            return (Criteria) this;
        }

        public Criteria andJyrqLessThan(Date value) {
            addCriterion("JYRQ <", value, "jyrq");
            return (Criteria) this;
        }

        public Criteria andJyrqLessThanOrEqualTo(Date value) {
            addCriterion("JYRQ <=", value, "jyrq");
            return (Criteria) this;
        }

        public Criteria andJyrqIn(List<Date> values) {
            addCriterion("JYRQ in", values, "jyrq");
            return (Criteria) this;
        }

        public Criteria andJyrqNotIn(List<Date> values) {
            addCriterion("JYRQ not in", values, "jyrq");
            return (Criteria) this;
        }

        public Criteria andJyrqBetween(Date value1, Date value2) {
            addCriterion("JYRQ between", value1, value2, "jyrq");
            return (Criteria) this;
        }

        public Criteria andJyrqNotBetween(Date value1, Date value2) {
            addCriterion("JYRQ not between", value1, value2, "jyrq");
            return (Criteria) this;
        }

        public Criteria andDbqhIsNull() {
            addCriterion("dbqh is null");
            return (Criteria) this;
        }

        public Criteria andDbqhIsNotNull() {
            addCriterion("dbqh is not null");
            return (Criteria) this;
        }

        public Criteria andDbqhEqualTo(String value) {
            addCriterion("dbqh =", value, "dbqh");
            return (Criteria) this;
        }

        public Criteria andDbqhNotEqualTo(String value) {
            addCriterion("dbqh <>", value, "dbqh");
            return (Criteria) this;
        }

        public Criteria andDbqhGreaterThan(String value) {
            addCriterion("dbqh >", value, "dbqh");
            return (Criteria) this;
        }

        public Criteria andDbqhGreaterThanOrEqualTo(String value) {
            addCriterion("dbqh >=", value, "dbqh");
            return (Criteria) this;
        }

        public Criteria andDbqhLessThan(String value) {
            addCriterion("dbqh <", value, "dbqh");
            return (Criteria) this;
        }

        public Criteria andDbqhLessThanOrEqualTo(String value) {
            addCriterion("dbqh <=", value, "dbqh");
            return (Criteria) this;
        }

        public Criteria andDbqhLike(String value) {
            addCriterion("dbqh like", value, "dbqh");
            return (Criteria) this;
        }

        public Criteria andDbqhNotLike(String value) {
            addCriterion("dbqh not like", value, "dbqh");
            return (Criteria) this;
        }

        public Criteria andDbqhIn(List<String> values) {
            addCriterion("dbqh in", values, "dbqh");
            return (Criteria) this;
        }

        public Criteria andDbqhNotIn(List<String> values) {
            addCriterion("dbqh not in", values, "dbqh");
            return (Criteria) this;
        }

        public Criteria andDbqhBetween(String value1, String value2) {
            addCriterion("dbqh between", value1, value2, "dbqh");
            return (Criteria) this;
        }

        public Criteria andDbqhNotBetween(String value1, String value2) {
            addCriterion("dbqh not between", value1, value2, "dbqh");
            return (Criteria) this;
        }

        public Criteria andDbmxIsNull() {
            addCriterion("dbmx is null");
            return (Criteria) this;
        }

        public Criteria andDbmxIsNotNull() {
            addCriterion("dbmx is not null");
            return (Criteria) this;
        }

        public Criteria andDbmxEqualTo(String value) {
            addCriterion("dbmx =", value, "dbmx");
            return (Criteria) this;
        }

        public Criteria andDbmxNotEqualTo(String value) {
            addCriterion("dbmx <>", value, "dbmx");
            return (Criteria) this;
        }

        public Criteria andDbmxGreaterThan(String value) {
            addCriterion("dbmx >", value, "dbmx");
            return (Criteria) this;
        }

        public Criteria andDbmxGreaterThanOrEqualTo(String value) {
            addCriterion("dbmx >=", value, "dbmx");
            return (Criteria) this;
        }

        public Criteria andDbmxLessThan(String value) {
            addCriterion("dbmx <", value, "dbmx");
            return (Criteria) this;
        }

        public Criteria andDbmxLessThanOrEqualTo(String value) {
            addCriterion("dbmx <=", value, "dbmx");
            return (Criteria) this;
        }

        public Criteria andDbmxLike(String value) {
            addCriterion("dbmx like", value, "dbmx");
            return (Criteria) this;
        }

        public Criteria andDbmxNotLike(String value) {
            addCriterion("dbmx not like", value, "dbmx");
            return (Criteria) this;
        }

        public Criteria andDbmxIn(List<String> values) {
            addCriterion("dbmx in", values, "dbmx");
            return (Criteria) this;
        }

        public Criteria andDbmxNotIn(List<String> values) {
            addCriterion("dbmx not in", values, "dbmx");
            return (Criteria) this;
        }

        public Criteria andDbmxBetween(String value1, String value2) {
            addCriterion("dbmx between", value1, value2, "dbmx");
            return (Criteria) this;
        }

        public Criteria andDbmxNotBetween(String value1, String value2) {
            addCriterion("dbmx not between", value1, value2, "dbmx");
            return (Criteria) this;
        }

        public Criteria andDbrqIsNull() {
            addCriterion("dbrq is null");
            return (Criteria) this;
        }

        public Criteria andDbrqIsNotNull() {
            addCriterion("dbrq is not null");
            return (Criteria) this;
        }

        public Criteria andDbrqEqualTo(Date value) {
            addCriterion("dbrq =", value, "dbrq");
            return (Criteria) this;
        }

        public Criteria andDbrqNotEqualTo(Date value) {
            addCriterion("dbrq <>", value, "dbrq");
            return (Criteria) this;
        }

        public Criteria andDbrqGreaterThan(Date value) {
            addCriterion("dbrq >", value, "dbrq");
            return (Criteria) this;
        }

        public Criteria andDbrqGreaterThanOrEqualTo(Date value) {
            addCriterion("dbrq >=", value, "dbrq");
            return (Criteria) this;
        }

        public Criteria andDbrqLessThan(Date value) {
            addCriterion("dbrq <", value, "dbrq");
            return (Criteria) this;
        }

        public Criteria andDbrqLessThanOrEqualTo(Date value) {
            addCriterion("dbrq <=", value, "dbrq");
            return (Criteria) this;
        }

        public Criteria andDbrqIn(List<Date> values) {
            addCriterion("dbrq in", values, "dbrq");
            return (Criteria) this;
        }

        public Criteria andDbrqNotIn(List<Date> values) {
            addCriterion("dbrq not in", values, "dbrq");
            return (Criteria) this;
        }

        public Criteria andDbrqBetween(Date value1, Date value2) {
            addCriterion("dbrq between", value1, value2, "dbrq");
            return (Criteria) this;
        }

        public Criteria andDbrqNotBetween(Date value1, Date value2) {
            addCriterion("dbrq not between", value1, value2, "dbrq");
            return (Criteria) this;
        }

        public Criteria andQsqhIsNull() {
            addCriterion("qsqh is null");
            return (Criteria) this;
        }

        public Criteria andQsqhIsNotNull() {
            addCriterion("qsqh is not null");
            return (Criteria) this;
        }

        public Criteria andQsqhEqualTo(String value) {
            addCriterion("qsqh =", value, "qsqh");
            return (Criteria) this;
        }

        public Criteria andQsqhNotEqualTo(String value) {
            addCriterion("qsqh <>", value, "qsqh");
            return (Criteria) this;
        }

        public Criteria andQsqhGreaterThan(String value) {
            addCriterion("qsqh >", value, "qsqh");
            return (Criteria) this;
        }

        public Criteria andQsqhGreaterThanOrEqualTo(String value) {
            addCriterion("qsqh >=", value, "qsqh");
            return (Criteria) this;
        }

        public Criteria andQsqhLessThan(String value) {
            addCriterion("qsqh <", value, "qsqh");
            return (Criteria) this;
        }

        public Criteria andQsqhLessThanOrEqualTo(String value) {
            addCriterion("qsqh <=", value, "qsqh");
            return (Criteria) this;
        }

        public Criteria andQsqhLike(String value) {
            addCriterion("qsqh like", value, "qsqh");
            return (Criteria) this;
        }

        public Criteria andQsqhNotLike(String value) {
            addCriterion("qsqh not like", value, "qsqh");
            return (Criteria) this;
        }

        public Criteria andQsqhIn(List<String> values) {
            addCriterion("qsqh in", values, "qsqh");
            return (Criteria) this;
        }

        public Criteria andQsqhNotIn(List<String> values) {
            addCriterion("qsqh not in", values, "qsqh");
            return (Criteria) this;
        }

        public Criteria andQsqhBetween(String value1, String value2) {
            addCriterion("qsqh between", value1, value2, "qsqh");
            return (Criteria) this;
        }

        public Criteria andQsqhNotBetween(String value1, String value2) {
            addCriterion("qsqh not between", value1, value2, "qsqh");
            return (Criteria) this;
        }

        public Criteria andRjrqIsNull() {
            addCriterion("RJRQ is null");
            return (Criteria) this;
        }

        public Criteria andRjrqIsNotNull() {
            addCriterion("RJRQ is not null");
            return (Criteria) this;
        }

        public Criteria andRjrqEqualTo(Date value) {
            addCriterion("RJRQ =", value, "rjrq");
            return (Criteria) this;
        }

        public Criteria andRjrqNotEqualTo(Date value) {
            addCriterion("RJRQ <>", value, "rjrq");
            return (Criteria) this;
        }

        public Criteria andRjrqGreaterThan(Date value) {
            addCriterion("RJRQ >", value, "rjrq");
            return (Criteria) this;
        }

        public Criteria andRjrqGreaterThanOrEqualTo(Date value) {
            addCriterion("RJRQ >=", value, "rjrq");
            return (Criteria) this;
        }

        public Criteria andRjrqLessThan(Date value) {
            addCriterion("RJRQ <", value, "rjrq");
            return (Criteria) this;
        }

        public Criteria andRjrqLessThanOrEqualTo(Date value) {
            addCriterion("RJRQ <=", value, "rjrq");
            return (Criteria) this;
        }

        public Criteria andRjrqIn(List<Date> values) {
            addCriterion("RJRQ in", values, "rjrq");
            return (Criteria) this;
        }

        public Criteria andRjrqNotIn(List<Date> values) {
            addCriterion("RJRQ not in", values, "rjrq");
            return (Criteria) this;
        }

        public Criteria andRjrqBetween(Date value1, Date value2) {
            addCriterion("RJRQ between", value1, value2, "rjrq");
            return (Criteria) this;
        }

        public Criteria andRjrqNotBetween(Date value1, Date value2) {
            addCriterion("RJRQ not between", value1, value2, "rjrq");
            return (Criteria) this;
        }

        public Criteria andYspjrqIsNull() {
            addCriterion("YSPJRQ is null");
            return (Criteria) this;
        }

        public Criteria andYspjrqIsNotNull() {
            addCriterion("YSPJRQ is not null");
            return (Criteria) this;
        }

        public Criteria andYspjrqEqualTo(Date value) {
            addCriterion("YSPJRQ =", value, "yspjrq");
            return (Criteria) this;
        }

        public Criteria andYspjrqNotEqualTo(Date value) {
            addCriterion("YSPJRQ <>", value, "yspjrq");
            return (Criteria) this;
        }

        public Criteria andYspjrqGreaterThan(Date value) {
            addCriterion("YSPJRQ >", value, "yspjrq");
            return (Criteria) this;
        }

        public Criteria andYspjrqGreaterThanOrEqualTo(Date value) {
            addCriterion("YSPJRQ >=", value, "yspjrq");
            return (Criteria) this;
        }

        public Criteria andYspjrqLessThan(Date value) {
            addCriterion("YSPJRQ <", value, "yspjrq");
            return (Criteria) this;
        }

        public Criteria andYspjrqLessThanOrEqualTo(Date value) {
            addCriterion("YSPJRQ <=", value, "yspjrq");
            return (Criteria) this;
        }

        public Criteria andYspjrqIn(List<Date> values) {
            addCriterion("YSPJRQ in", values, "yspjrq");
            return (Criteria) this;
        }

        public Criteria andYspjrqNotIn(List<Date> values) {
            addCriterion("YSPJRQ not in", values, "yspjrq");
            return (Criteria) this;
        }

        public Criteria andYspjrqBetween(Date value1, Date value2) {
            addCriterion("YSPJRQ between", value1, value2, "yspjrq");
            return (Criteria) this;
        }

        public Criteria andYspjrqNotBetween(Date value1, Date value2) {
            addCriterion("YSPJRQ not between", value1, value2, "yspjrq");
            return (Criteria) this;
        }

        public Criteria andYsmxIsNull() {
            addCriterion("ysmx is null");
            return (Criteria) this;
        }

        public Criteria andYsmxIsNotNull() {
            addCriterion("ysmx is not null");
            return (Criteria) this;
        }

        public Criteria andYsmxEqualTo(String value) {
            addCriterion("ysmx =", value, "ysmx");
            return (Criteria) this;
        }

        public Criteria andYsmxNotEqualTo(String value) {
            addCriterion("ysmx <>", value, "ysmx");
            return (Criteria) this;
        }

        public Criteria andYsmxGreaterThan(String value) {
            addCriterion("ysmx >", value, "ysmx");
            return (Criteria) this;
        }

        public Criteria andYsmxGreaterThanOrEqualTo(String value) {
            addCriterion("ysmx >=", value, "ysmx");
            return (Criteria) this;
        }

        public Criteria andYsmxLessThan(String value) {
            addCriterion("ysmx <", value, "ysmx");
            return (Criteria) this;
        }

        public Criteria andYsmxLessThanOrEqualTo(String value) {
            addCriterion("ysmx <=", value, "ysmx");
            return (Criteria) this;
        }

        public Criteria andYsmxLike(String value) {
            addCriterion("ysmx like", value, "ysmx");
            return (Criteria) this;
        }

        public Criteria andYsmxNotLike(String value) {
            addCriterion("ysmx not like", value, "ysmx");
            return (Criteria) this;
        }

        public Criteria andYsmxIn(List<String> values) {
            addCriterion("ysmx in", values, "ysmx");
            return (Criteria) this;
        }

        public Criteria andYsmxNotIn(List<String> values) {
            addCriterion("ysmx not in", values, "ysmx");
            return (Criteria) this;
        }

        public Criteria andYsmxBetween(String value1, String value2) {
            addCriterion("ysmx between", value1, value2, "ysmx");
            return (Criteria) this;
        }

        public Criteria andYsmxNotBetween(String value1, String value2) {
            addCriterion("ysmx not between", value1, value2, "ysmx");
            return (Criteria) this;
        }

        public Criteria andYszmIsNull() {
            addCriterion("YSZM is null");
            return (Criteria) this;
        }

        public Criteria andYszmIsNotNull() {
            addCriterion("YSZM is not null");
            return (Criteria) this;
        }

        public Criteria andYszmEqualTo(String value) {
            addCriterion("YSZM =", value, "yszm");
            return (Criteria) this;
        }

        public Criteria andYszmNotEqualTo(String value) {
            addCriterion("YSZM <>", value, "yszm");
            return (Criteria) this;
        }

        public Criteria andYszmGreaterThan(String value) {
            addCriterion("YSZM >", value, "yszm");
            return (Criteria) this;
        }

        public Criteria andYszmGreaterThanOrEqualTo(String value) {
            addCriterion("YSZM >=", value, "yszm");
            return (Criteria) this;
        }

        public Criteria andYszmLessThan(String value) {
            addCriterion("YSZM <", value, "yszm");
            return (Criteria) this;
        }

        public Criteria andYszmLessThanOrEqualTo(String value) {
            addCriterion("YSZM <=", value, "yszm");
            return (Criteria) this;
        }

        public Criteria andYszmLike(String value) {
            addCriterion("YSZM like", value, "yszm");
            return (Criteria) this;
        }

        public Criteria andYszmNotLike(String value) {
            addCriterion("YSZM not like", value, "yszm");
            return (Criteria) this;
        }

        public Criteria andYszmIn(List<String> values) {
            addCriterion("YSZM in", values, "yszm");
            return (Criteria) this;
        }

        public Criteria andYszmNotIn(List<String> values) {
            addCriterion("YSZM not in", values, "yszm");
            return (Criteria) this;
        }

        public Criteria andYszmBetween(String value1, String value2) {
            addCriterion("YSZM between", value1, value2, "yszm");
            return (Criteria) this;
        }

        public Criteria andYszmNotBetween(String value1, String value2) {
            addCriterion("YSZM not between", value1, value2, "yszm");
            return (Criteria) this;
        }

        public Criteria andYsxqIsNull() {
            addCriterion("YSXQ is null");
            return (Criteria) this;
        }

        public Criteria andYsxqIsNotNull() {
            addCriterion("YSXQ is not null");
            return (Criteria) this;
        }

        public Criteria andYsxqEqualTo(String value) {
            addCriterion("YSXQ =", value, "ysxq");
            return (Criteria) this;
        }

        public Criteria andYsxqNotEqualTo(String value) {
            addCriterion("YSXQ <>", value, "ysxq");
            return (Criteria) this;
        }

        public Criteria andYsxqGreaterThan(String value) {
            addCriterion("YSXQ >", value, "ysxq");
            return (Criteria) this;
        }

        public Criteria andYsxqGreaterThanOrEqualTo(String value) {
            addCriterion("YSXQ >=", value, "ysxq");
            return (Criteria) this;
        }

        public Criteria andYsxqLessThan(String value) {
            addCriterion("YSXQ <", value, "ysxq");
            return (Criteria) this;
        }

        public Criteria andYsxqLessThanOrEqualTo(String value) {
            addCriterion("YSXQ <=", value, "ysxq");
            return (Criteria) this;
        }

        public Criteria andYsxqLike(String value) {
            addCriterion("YSXQ like", value, "ysxq");
            return (Criteria) this;
        }

        public Criteria andYsxqNotLike(String value) {
            addCriterion("YSXQ not like", value, "ysxq");
            return (Criteria) this;
        }

        public Criteria andYsxqIn(List<String> values) {
            addCriterion("YSXQ in", values, "ysxq");
            return (Criteria) this;
        }

        public Criteria andYsxqNotIn(List<String> values) {
            addCriterion("YSXQ not in", values, "ysxq");
            return (Criteria) this;
        }

        public Criteria andYsxqBetween(String value1, String value2) {
            addCriterion("YSXQ between", value1, value2, "ysxq");
            return (Criteria) this;
        }

        public Criteria andYsxqNotBetween(String value1, String value2) {
            addCriterion("YSXQ not between", value1, value2, "ysxq");
            return (Criteria) this;
        }

        public Criteria andPcmxIsNull() {
            addCriterion("PCMX is null");
            return (Criteria) this;
        }

        public Criteria andPcmxIsNotNull() {
            addCriterion("PCMX is not null");
            return (Criteria) this;
        }

        public Criteria andPcmxEqualTo(String value) {
            addCriterion("PCMX =", value, "pcmx");
            return (Criteria) this;
        }

        public Criteria andPcmxNotEqualTo(String value) {
            addCriterion("PCMX <>", value, "pcmx");
            return (Criteria) this;
        }

        public Criteria andPcmxGreaterThan(String value) {
            addCriterion("PCMX >", value, "pcmx");
            return (Criteria) this;
        }

        public Criteria andPcmxGreaterThanOrEqualTo(String value) {
            addCriterion("PCMX >=", value, "pcmx");
            return (Criteria) this;
        }

        public Criteria andPcmxLessThan(String value) {
            addCriterion("PCMX <", value, "pcmx");
            return (Criteria) this;
        }

        public Criteria andPcmxLessThanOrEqualTo(String value) {
            addCriterion("PCMX <=", value, "pcmx");
            return (Criteria) this;
        }

        public Criteria andPcmxLike(String value) {
            addCriterion("PCMX like", value, "pcmx");
            return (Criteria) this;
        }

        public Criteria andPcmxNotLike(String value) {
            addCriterion("PCMX not like", value, "pcmx");
            return (Criteria) this;
        }

        public Criteria andPcmxIn(List<String> values) {
            addCriterion("PCMX in", values, "pcmx");
            return (Criteria) this;
        }

        public Criteria andPcmxNotIn(List<String> values) {
            addCriterion("PCMX not in", values, "pcmx");
            return (Criteria) this;
        }

        public Criteria andPcmxBetween(String value1, String value2) {
            addCriterion("PCMX between", value1, value2, "pcmx");
            return (Criteria) this;
        }

        public Criteria andPcmxNotBetween(String value1, String value2) {
            addCriterion("PCMX not between", value1, value2, "pcmx");
            return (Criteria) this;
        }

        public Criteria andZmIsNull() {
            addCriterion("zm is null");
            return (Criteria) this;
        }

        public Criteria andZmIsNotNull() {
            addCriterion("zm is not null");
            return (Criteria) this;
        }

        public Criteria andZmEqualTo(String value) {
            addCriterion("zm =", value, "zm");
            return (Criteria) this;
        }

        public Criteria andZmNotEqualTo(String value) {
            addCriterion("zm <>", value, "zm");
            return (Criteria) this;
        }

        public Criteria andZmGreaterThan(String value) {
            addCriterion("zm >", value, "zm");
            return (Criteria) this;
        }

        public Criteria andZmGreaterThanOrEqualTo(String value) {
            addCriterion("zm >=", value, "zm");
            return (Criteria) this;
        }

        public Criteria andZmLessThan(String value) {
            addCriterion("zm <", value, "zm");
            return (Criteria) this;
        }

        public Criteria andZmLessThanOrEqualTo(String value) {
            addCriterion("zm <=", value, "zm");
            return (Criteria) this;
        }

        public Criteria andZmLike(String value) {
            addCriterion("zm like", value, "zm");
            return (Criteria) this;
        }

        public Criteria andZmNotLike(String value) {
            addCriterion("zm not like", value, "zm");
            return (Criteria) this;
        }

        public Criteria andZmIn(List<String> values) {
            addCriterion("zm in", values, "zm");
            return (Criteria) this;
        }

        public Criteria andZmNotIn(List<String> values) {
            addCriterion("zm not in", values, "zm");
            return (Criteria) this;
        }

        public Criteria andZmBetween(String value1, String value2) {
            addCriterion("zm between", value1, value2, "zm");
            return (Criteria) this;
        }

        public Criteria andZmNotBetween(String value1, String value2) {
            addCriterion("zm not between", value1, value2, "zm");
            return (Criteria) this;
        }

        public Criteria andXqIsNull() {
            addCriterion("xq is null");
            return (Criteria) this;
        }

        public Criteria andXqIsNotNull() {
            addCriterion("xq is not null");
            return (Criteria) this;
        }

        public Criteria andXqEqualTo(String value) {
            addCriterion("xq =", value, "xq");
            return (Criteria) this;
        }

        public Criteria andXqNotEqualTo(String value) {
            addCriterion("xq <>", value, "xq");
            return (Criteria) this;
        }

        public Criteria andXqGreaterThan(String value) {
            addCriterion("xq >", value, "xq");
            return (Criteria) this;
        }

        public Criteria andXqGreaterThanOrEqualTo(String value) {
            addCriterion("xq >=", value, "xq");
            return (Criteria) this;
        }

        public Criteria andXqLessThan(String value) {
            addCriterion("xq <", value, "xq");
            return (Criteria) this;
        }

        public Criteria andXqLessThanOrEqualTo(String value) {
            addCriterion("xq <=", value, "xq");
            return (Criteria) this;
        }

        public Criteria andXqLike(String value) {
            addCriterion("xq like", value, "xq");
            return (Criteria) this;
        }

        public Criteria andXqNotLike(String value) {
            addCriterion("xq not like", value, "xq");
            return (Criteria) this;
        }

        public Criteria andXqIn(List<String> values) {
            addCriterion("xq in", values, "xq");
            return (Criteria) this;
        }

        public Criteria andXqNotIn(List<String> values) {
            addCriterion("xq not in", values, "xq");
            return (Criteria) this;
        }

        public Criteria andXqBetween(String value1, String value2) {
            addCriterion("xq between", value1, value2, "xq");
            return (Criteria) this;
        }

        public Criteria andXqNotBetween(String value1, String value2) {
            addCriterion("xq not between", value1, value2, "xq");
            return (Criteria) this;
        }

        public Criteria andQrIsNull() {
            addCriterion("qr is null");
            return (Criteria) this;
        }

        public Criteria andQrIsNotNull() {
            addCriterion("qr is not null");
            return (Criteria) this;
        }

        public Criteria andQrEqualTo(Date value) {
            addCriterion("qr =", value, "qr");
            return (Criteria) this;
        }

        public Criteria andQrNotEqualTo(Date value) {
            addCriterion("qr <>", value, "qr");
            return (Criteria) this;
        }

        public Criteria andQrGreaterThan(Date value) {
            addCriterion("qr >", value, "qr");
            return (Criteria) this;
        }

        public Criteria andQrGreaterThanOrEqualTo(Date value) {
            addCriterion("qr >=", value, "qr");
            return (Criteria) this;
        }

        public Criteria andQrLessThan(Date value) {
            addCriterion("qr <", value, "qr");
            return (Criteria) this;
        }

        public Criteria andQrLessThanOrEqualTo(Date value) {
            addCriterion("qr <=", value, "qr");
            return (Criteria) this;
        }

        public Criteria andQrIn(List<Date> values) {
            addCriterion("qr in", values, "qr");
            return (Criteria) this;
        }

        public Criteria andQrNotIn(List<Date> values) {
            addCriterion("qr not in", values, "qr");
            return (Criteria) this;
        }

        public Criteria andQrBetween(Date value1, Date value2) {
            addCriterion("qr between", value1, value2, "qr");
            return (Criteria) this;
        }

        public Criteria andQrNotBetween(Date value1, Date value2) {
            addCriterion("qr not between", value1, value2, "qr");
            return (Criteria) this;
        }

        public Criteria andZrIsNull() {
            addCriterion("zr is null");
            return (Criteria) this;
        }

        public Criteria andZrIsNotNull() {
            addCriterion("zr is not null");
            return (Criteria) this;
        }

        public Criteria andZrEqualTo(Date value) {
            addCriterion("zr =", value, "zr");
            return (Criteria) this;
        }

        public Criteria andZrNotEqualTo(Date value) {
            addCriterion("zr <>", value, "zr");
            return (Criteria) this;
        }

        public Criteria andZrGreaterThan(Date value) {
            addCriterion("zr >", value, "zr");
            return (Criteria) this;
        }

        public Criteria andZrGreaterThanOrEqualTo(Date value) {
            addCriterion("zr >=", value, "zr");
            return (Criteria) this;
        }

        public Criteria andZrLessThan(Date value) {
            addCriterion("zr <", value, "zr");
            return (Criteria) this;
        }

        public Criteria andZrLessThanOrEqualTo(Date value) {
            addCriterion("zr <=", value, "zr");
            return (Criteria) this;
        }

        public Criteria andZrIn(List<Date> values) {
            addCriterion("zr in", values, "zr");
            return (Criteria) this;
        }

        public Criteria andZrNotIn(List<Date> values) {
            addCriterion("zr not in", values, "zr");
            return (Criteria) this;
        }

        public Criteria andZrBetween(Date value1, Date value2) {
            addCriterion("zr between", value1, value2, "zr");
            return (Criteria) this;
        }

        public Criteria andZrNotBetween(Date value1, Date value2) {
            addCriterion("zr not between", value1, value2, "zr");
            return (Criteria) this;
        }

        public Criteria andBznxIsNull() {
            addCriterion("bznx is null");
            return (Criteria) this;
        }

        public Criteria andBznxIsNotNull() {
            addCriterion("bznx is not null");
            return (Criteria) this;
        }

        public Criteria andBznxEqualTo(String value) {
            addCriterion("bznx =", value, "bznx");
            return (Criteria) this;
        }

        public Criteria andBznxNotEqualTo(String value) {
            addCriterion("bznx <>", value, "bznx");
            return (Criteria) this;
        }

        public Criteria andBznxGreaterThan(String value) {
            addCriterion("bznx >", value, "bznx");
            return (Criteria) this;
        }

        public Criteria andBznxGreaterThanOrEqualTo(String value) {
            addCriterion("bznx >=", value, "bznx");
            return (Criteria) this;
        }

        public Criteria andBznxLessThan(String value) {
            addCriterion("bznx <", value, "bznx");
            return (Criteria) this;
        }

        public Criteria andBznxLessThanOrEqualTo(String value) {
            addCriterion("bznx <=", value, "bznx");
            return (Criteria) this;
        }

        public Criteria andBznxLike(String value) {
            addCriterion("bznx like", value, "bznx");
            return (Criteria) this;
        }

        public Criteria andBznxNotLike(String value) {
            addCriterion("bznx not like", value, "bznx");
            return (Criteria) this;
        }

        public Criteria andBznxIn(List<String> values) {
            addCriterion("bznx in", values, "bznx");
            return (Criteria) this;
        }

        public Criteria andBznxNotIn(List<String> values) {
            addCriterion("bznx not in", values, "bznx");
            return (Criteria) this;
        }

        public Criteria andBznxBetween(String value1, String value2) {
            addCriterion("bznx between", value1, value2, "bznx");
            return (Criteria) this;
        }

        public Criteria andBznxNotBetween(String value1, String value2) {
            addCriterion("bznx not between", value1, value2, "bznx");
            return (Criteria) this;
        }

        public Criteria andFjjeIsNull() {
            addCriterion("fjje is null");
            return (Criteria) this;
        }

        public Criteria andFjjeIsNotNull() {
            addCriterion("fjje is not null");
            return (Criteria) this;
        }

        public Criteria andFjjeEqualTo(String value) {
            addCriterion("fjje =", value, "fjje");
            return (Criteria) this;
        }

        public Criteria andFjjeNotEqualTo(String value) {
            addCriterion("fjje <>", value, "fjje");
            return (Criteria) this;
        }

        public Criteria andFjjeGreaterThan(String value) {
            addCriterion("fjje >", value, "fjje");
            return (Criteria) this;
        }

        public Criteria andFjjeGreaterThanOrEqualTo(String value) {
            addCriterion("fjje >=", value, "fjje");
            return (Criteria) this;
        }

        public Criteria andFjjeLessThan(String value) {
            addCriterion("fjje <", value, "fjje");
            return (Criteria) this;
        }

        public Criteria andFjjeLessThanOrEqualTo(String value) {
            addCriterion("fjje <=", value, "fjje");
            return (Criteria) this;
        }

        public Criteria andFjjeLike(String value) {
            addCriterion("fjje like", value, "fjje");
            return (Criteria) this;
        }

        public Criteria andFjjeNotLike(String value) {
            addCriterion("fjje not like", value, "fjje");
            return (Criteria) this;
        }

        public Criteria andFjjeIn(List<String> values) {
            addCriterion("fjje in", values, "fjje");
            return (Criteria) this;
        }

        public Criteria andFjjeNotIn(List<String> values) {
            addCriterion("fjje not in", values, "fjje");
            return (Criteria) this;
        }

        public Criteria andFjjeBetween(String value1, String value2) {
            addCriterion("fjje between", value1, value2, "fjje");
            return (Criteria) this;
        }

        public Criteria andFjjeNotBetween(String value1, String value2) {
            addCriterion("fjje not between", value1, value2, "fjje");
            return (Criteria) this;
        }

        public Criteria andAflbIsNull() {
            addCriterion("aflb is null");
            return (Criteria) this;
        }

        public Criteria andAflbIsNotNull() {
            addCriterion("aflb is not null");
            return (Criteria) this;
        }

        public Criteria andAflbEqualTo(String value) {
            addCriterion("aflb =", value, "aflb");
            return (Criteria) this;
        }

        public Criteria andAflbNotEqualTo(String value) {
            addCriterion("aflb <>", value, "aflb");
            return (Criteria) this;
        }

        public Criteria andAflbGreaterThan(String value) {
            addCriterion("aflb >", value, "aflb");
            return (Criteria) this;
        }

        public Criteria andAflbGreaterThanOrEqualTo(String value) {
            addCriterion("aflb >=", value, "aflb");
            return (Criteria) this;
        }

        public Criteria andAflbLessThan(String value) {
            addCriterion("aflb <", value, "aflb");
            return (Criteria) this;
        }

        public Criteria andAflbLessThanOrEqualTo(String value) {
            addCriterion("aflb <=", value, "aflb");
            return (Criteria) this;
        }

        public Criteria andAflbLike(String value) {
            addCriterion("aflb like", value, "aflb");
            return (Criteria) this;
        }

        public Criteria andAflbNotLike(String value) {
            addCriterion("aflb not like", value, "aflb");
            return (Criteria) this;
        }

        public Criteria andAflbIn(List<String> values) {
            addCriterion("aflb in", values, "aflb");
            return (Criteria) this;
        }

        public Criteria andAflbNotIn(List<String> values) {
            addCriterion("aflb not in", values, "aflb");
            return (Criteria) this;
        }

        public Criteria andAflbBetween(String value1, String value2) {
            addCriterion("aflb between", value1, value2, "aflb");
            return (Criteria) this;
        }

        public Criteria andAflbNotBetween(String value1, String value2) {
            addCriterion("aflb not between", value1, value2, "aflb");
            return (Criteria) this;
        }

        public Criteria andSylbIsNull() {
            addCriterion("sylb is null");
            return (Criteria) this;
        }

        public Criteria andSylbIsNotNull() {
            addCriterion("sylb is not null");
            return (Criteria) this;
        }

        public Criteria andSylbEqualTo(String value) {
            addCriterion("sylb =", value, "sylb");
            return (Criteria) this;
        }

        public Criteria andSylbNotEqualTo(String value) {
            addCriterion("sylb <>", value, "sylb");
            return (Criteria) this;
        }

        public Criteria andSylbGreaterThan(String value) {
            addCriterion("sylb >", value, "sylb");
            return (Criteria) this;
        }

        public Criteria andSylbGreaterThanOrEqualTo(String value) {
            addCriterion("sylb >=", value, "sylb");
            return (Criteria) this;
        }

        public Criteria andSylbLessThan(String value) {
            addCriterion("sylb <", value, "sylb");
            return (Criteria) this;
        }

        public Criteria andSylbLessThanOrEqualTo(String value) {
            addCriterion("sylb <=", value, "sylb");
            return (Criteria) this;
        }

        public Criteria andSylbLike(String value) {
            addCriterion("sylb like", value, "sylb");
            return (Criteria) this;
        }

        public Criteria andSylbNotLike(String value) {
            addCriterion("sylb not like", value, "sylb");
            return (Criteria) this;
        }

        public Criteria andSylbIn(List<String> values) {
            addCriterion("sylb in", values, "sylb");
            return (Criteria) this;
        }

        public Criteria andSylbNotIn(List<String> values) {
            addCriterion("sylb not in", values, "sylb");
            return (Criteria) this;
        }

        public Criteria andSylbBetween(String value1, String value2) {
            addCriterion("sylb between", value1, value2, "sylb");
            return (Criteria) this;
        }

        public Criteria andSylbNotBetween(String value1, String value2) {
            addCriterion("sylb not between", value1, value2, "sylb");
            return (Criteria) this;
        }

        public Criteria andSyrqIsNull() {
            addCriterion("SYRQ is null");
            return (Criteria) this;
        }

        public Criteria andSyrqIsNotNull() {
            addCriterion("SYRQ is not null");
            return (Criteria) this;
        }

        public Criteria andSyrqEqualTo(Date value) {
            addCriterion("SYRQ =", value, "syrq");
            return (Criteria) this;
        }

        public Criteria andSyrqNotEqualTo(Date value) {
            addCriterion("SYRQ <>", value, "syrq");
            return (Criteria) this;
        }

        public Criteria andSyrqGreaterThan(Date value) {
            addCriterion("SYRQ >", value, "syrq");
            return (Criteria) this;
        }

        public Criteria andSyrqGreaterThanOrEqualTo(Date value) {
            addCriterion("SYRQ >=", value, "syrq");
            return (Criteria) this;
        }

        public Criteria andSyrqLessThan(Date value) {
            addCriterion("SYRQ <", value, "syrq");
            return (Criteria) this;
        }

        public Criteria andSyrqLessThanOrEqualTo(Date value) {
            addCriterion("SYRQ <=", value, "syrq");
            return (Criteria) this;
        }

        public Criteria andSyrqIn(List<Date> values) {
            addCriterion("SYRQ in", values, "syrq");
            return (Criteria) this;
        }

        public Criteria andSyrqNotIn(List<Date> values) {
            addCriterion("SYRQ not in", values, "syrq");
            return (Criteria) this;
        }

        public Criteria andSyrqBetween(Date value1, Date value2) {
            addCriterion("SYRQ between", value1, value2, "syrq");
            return (Criteria) this;
        }

        public Criteria andSyrqNotBetween(Date value1, Date value2) {
            addCriterion("SYRQ not between", value1, value2, "syrq");
            return (Criteria) this;
        }

        public Criteria andSyjg1IsNull() {
            addCriterion("SYJG1 is null");
            return (Criteria) this;
        }

        public Criteria andSyjg1IsNotNull() {
            addCriterion("SYJG1 is not null");
            return (Criteria) this;
        }

        public Criteria andSyjg1EqualTo(String value) {
            addCriterion("SYJG1 =", value, "syjg1");
            return (Criteria) this;
        }

        public Criteria andSyjg1NotEqualTo(String value) {
            addCriterion("SYJG1 <>", value, "syjg1");
            return (Criteria) this;
        }

        public Criteria andSyjg1GreaterThan(String value) {
            addCriterion("SYJG1 >", value, "syjg1");
            return (Criteria) this;
        }

        public Criteria andSyjg1GreaterThanOrEqualTo(String value) {
            addCriterion("SYJG1 >=", value, "syjg1");
            return (Criteria) this;
        }

        public Criteria andSyjg1LessThan(String value) {
            addCriterion("SYJG1 <", value, "syjg1");
            return (Criteria) this;
        }

        public Criteria andSyjg1LessThanOrEqualTo(String value) {
            addCriterion("SYJG1 <=", value, "syjg1");
            return (Criteria) this;
        }

        public Criteria andSyjg1Like(String value) {
            addCriterion("SYJG1 like", value, "syjg1");
            return (Criteria) this;
        }

        public Criteria andSyjg1NotLike(String value) {
            addCriterion("SYJG1 not like", value, "syjg1");
            return (Criteria) this;
        }

        public Criteria andSyjg1In(List<String> values) {
            addCriterion("SYJG1 in", values, "syjg1");
            return (Criteria) this;
        }

        public Criteria andSyjg1NotIn(List<String> values) {
            addCriterion("SYJG1 not in", values, "syjg1");
            return (Criteria) this;
        }

        public Criteria andSyjg1Between(String value1, String value2) {
            addCriterion("SYJG1 between", value1, value2, "syjg1");
            return (Criteria) this;
        }

        public Criteria andSyjg1NotBetween(String value1, String value2) {
            addCriterion("SYJG1 not between", value1, value2, "syjg1");
            return (Criteria) this;
        }

        public Criteria andLjrqIsNull() {
            addCriterion("ljrq is null");
            return (Criteria) this;
        }

        public Criteria andLjrqIsNotNull() {
            addCriterion("ljrq is not null");
            return (Criteria) this;
        }

        public Criteria andLjrqEqualTo(Date value) {
            addCriterion("ljrq =", value, "ljrq");
            return (Criteria) this;
        }

        public Criteria andLjrqNotEqualTo(Date value) {
            addCriterion("ljrq <>", value, "ljrq");
            return (Criteria) this;
        }

        public Criteria andLjrqGreaterThan(Date value) {
            addCriterion("ljrq >", value, "ljrq");
            return (Criteria) this;
        }

        public Criteria andLjrqGreaterThanOrEqualTo(Date value) {
            addCriterion("ljrq >=", value, "ljrq");
            return (Criteria) this;
        }

        public Criteria andLjrqLessThan(Date value) {
            addCriterion("ljrq <", value, "ljrq");
            return (Criteria) this;
        }

        public Criteria andLjrqLessThanOrEqualTo(Date value) {
            addCriterion("ljrq <=", value, "ljrq");
            return (Criteria) this;
        }

        public Criteria andLjrqIn(List<Date> values) {
            addCriterion("ljrq in", values, "ljrq");
            return (Criteria) this;
        }

        public Criteria andLjrqNotIn(List<Date> values) {
            addCriterion("ljrq not in", values, "ljrq");
            return (Criteria) this;
        }

        public Criteria andLjrqBetween(Date value1, Date value2) {
            addCriterion("ljrq between", value1, value2, "ljrq");
            return (Criteria) this;
        }

        public Criteria andLjrqNotBetween(Date value1, Date value2) {
            addCriterion("ljrq not between", value1, value2, "ljrq");
            return (Criteria) this;
        }

        public Criteria andQxqhIsNull() {
            addCriterion("QXQH is null");
            return (Criteria) this;
        }

        public Criteria andQxqhIsNotNull() {
            addCriterion("QXQH is not null");
            return (Criteria) this;
        }

        public Criteria andQxqhEqualTo(String value) {
            addCriterion("QXQH =", value, "qxqh");
            return (Criteria) this;
        }

        public Criteria andQxqhNotEqualTo(String value) {
            addCriterion("QXQH <>", value, "qxqh");
            return (Criteria) this;
        }

        public Criteria andQxqhGreaterThan(String value) {
            addCriterion("QXQH >", value, "qxqh");
            return (Criteria) this;
        }

        public Criteria andQxqhGreaterThanOrEqualTo(String value) {
            addCriterion("QXQH >=", value, "qxqh");
            return (Criteria) this;
        }

        public Criteria andQxqhLessThan(String value) {
            addCriterion("QXQH <", value, "qxqh");
            return (Criteria) this;
        }

        public Criteria andQxqhLessThanOrEqualTo(String value) {
            addCriterion("QXQH <=", value, "qxqh");
            return (Criteria) this;
        }

        public Criteria andQxqhLike(String value) {
            addCriterion("QXQH like", value, "qxqh");
            return (Criteria) this;
        }

        public Criteria andQxqhNotLike(String value) {
            addCriterion("QXQH not like", value, "qxqh");
            return (Criteria) this;
        }

        public Criteria andQxqhIn(List<String> values) {
            addCriterion("QXQH in", values, "qxqh");
            return (Criteria) this;
        }

        public Criteria andQxqhNotIn(List<String> values) {
            addCriterion("QXQH not in", values, "qxqh");
            return (Criteria) this;
        }

        public Criteria andQxqhBetween(String value1, String value2) {
            addCriterion("QXQH between", value1, value2, "qxqh");
            return (Criteria) this;
        }

        public Criteria andQxqhNotBetween(String value1, String value2) {
            addCriterion("QXQH not between", value1, value2, "qxqh");
            return (Criteria) this;
        }

        public Criteria andQxmxIsNull() {
            addCriterion("QXMX is null");
            return (Criteria) this;
        }

        public Criteria andQxmxIsNotNull() {
            addCriterion("QXMX is not null");
            return (Criteria) this;
        }

        public Criteria andQxmxEqualTo(String value) {
            addCriterion("QXMX =", value, "qxmx");
            return (Criteria) this;
        }

        public Criteria andQxmxNotEqualTo(String value) {
            addCriterion("QXMX <>", value, "qxmx");
            return (Criteria) this;
        }

        public Criteria andQxmxGreaterThan(String value) {
            addCriterion("QXMX >", value, "qxmx");
            return (Criteria) this;
        }

        public Criteria andQxmxGreaterThanOrEqualTo(String value) {
            addCriterion("QXMX >=", value, "qxmx");
            return (Criteria) this;
        }

        public Criteria andQxmxLessThan(String value) {
            addCriterion("QXMX <", value, "qxmx");
            return (Criteria) this;
        }

        public Criteria andQxmxLessThanOrEqualTo(String value) {
            addCriterion("QXMX <=", value, "qxmx");
            return (Criteria) this;
        }

        public Criteria andQxmxLike(String value) {
            addCriterion("QXMX like", value, "qxmx");
            return (Criteria) this;
        }

        public Criteria andQxmxNotLike(String value) {
            addCriterion("QXMX not like", value, "qxmx");
            return (Criteria) this;
        }

        public Criteria andQxmxIn(List<String> values) {
            addCriterion("QXMX in", values, "qxmx");
            return (Criteria) this;
        }

        public Criteria andQxmxNotIn(List<String> values) {
            addCriterion("QXMX not in", values, "qxmx");
            return (Criteria) this;
        }

        public Criteria andQxmxBetween(String value1, String value2) {
            addCriterion("QXMX between", value1, value2, "qxmx");
            return (Criteria) this;
        }

        public Criteria andQxmxNotBetween(String value1, String value2) {
            addCriterion("QXMX not between", value1, value2, "qxmx");
            return (Criteria) this;
        }

        public Criteria andKhfIsNull() {
            addCriterion("khf is null");
            return (Criteria) this;
        }

        public Criteria andKhfIsNotNull() {
            addCriterion("khf is not null");
            return (Criteria) this;
        }

        public Criteria andKhfEqualTo(Double value) {
            addCriterion("khf =", value, "khf");
            return (Criteria) this;
        }

        public Criteria andKhfNotEqualTo(Double value) {
            addCriterion("khf <>", value, "khf");
            return (Criteria) this;
        }

        public Criteria andKhfGreaterThan(Double value) {
            addCriterion("khf >", value, "khf");
            return (Criteria) this;
        }

        public Criteria andKhfGreaterThanOrEqualTo(Double value) {
            addCriterion("khf >=", value, "khf");
            return (Criteria) this;
        }

        public Criteria andKhfLessThan(Double value) {
            addCriterion("khf <", value, "khf");
            return (Criteria) this;
        }

        public Criteria andKhfLessThanOrEqualTo(Double value) {
            addCriterion("khf <=", value, "khf");
            return (Criteria) this;
        }

        public Criteria andKhfIn(List<Double> values) {
            addCriterion("khf in", values, "khf");
            return (Criteria) this;
        }

        public Criteria andKhfNotIn(List<Double> values) {
            addCriterion("khf not in", values, "khf");
            return (Criteria) this;
        }

        public Criteria andKhfBetween(Double value1, Double value2) {
            addCriterion("khf between", value1, value2, "khf");
            return (Criteria) this;
        }

        public Criteria andKhfNotBetween(Double value1, Double value2) {
            addCriterion("khf not between", value1, value2, "khf");
            return (Criteria) this;
        }

        public Criteria andDahIsNull() {
            addCriterion("DAH is null");
            return (Criteria) this;
        }

        public Criteria andDahIsNotNull() {
            addCriterion("DAH is not null");
            return (Criteria) this;
        }

        public Criteria andDahEqualTo(String value) {
            addCriterion("DAH =", value, "dah");
            return (Criteria) this;
        }

        public Criteria andDahNotEqualTo(String value) {
            addCriterion("DAH <>", value, "dah");
            return (Criteria) this;
        }

        public Criteria andDahGreaterThan(String value) {
            addCriterion("DAH >", value, "dah");
            return (Criteria) this;
        }

        public Criteria andDahGreaterThanOrEqualTo(String value) {
            addCriterion("DAH >=", value, "dah");
            return (Criteria) this;
        }

        public Criteria andDahLessThan(String value) {
            addCriterion("DAH <", value, "dah");
            return (Criteria) this;
        }

        public Criteria andDahLessThanOrEqualTo(String value) {
            addCriterion("DAH <=", value, "dah");
            return (Criteria) this;
        }

        public Criteria andDahLike(String value) {
            addCriterion("DAH like", value, "dah");
            return (Criteria) this;
        }

        public Criteria andDahNotLike(String value) {
            addCriterion("DAH not like", value, "dah");
            return (Criteria) this;
        }

        public Criteria andDahIn(List<String> values) {
            addCriterion("DAH in", values, "dah");
            return (Criteria) this;
        }

        public Criteria andDahNotIn(List<String> values) {
            addCriterion("DAH not in", values, "dah");
            return (Criteria) this;
        }

        public Criteria andDahBetween(String value1, String value2) {
            addCriterion("DAH between", value1, value2, "dah");
            return (Criteria) this;
        }

        public Criteria andDahNotBetween(String value1, String value2) {
            addCriterion("DAH not between", value1, value2, "dah");
            return (Criteria) this;
        }

        public Criteria andGymxIsNull() {
            addCriterion("GYMX is null");
            return (Criteria) this;
        }

        public Criteria andGymxIsNotNull() {
            addCriterion("GYMX is not null");
            return (Criteria) this;
        }

        public Criteria andGymxEqualTo(String value) {
            addCriterion("GYMX =", value, "gymx");
            return (Criteria) this;
        }

        public Criteria andGymxNotEqualTo(String value) {
            addCriterion("GYMX <>", value, "gymx");
            return (Criteria) this;
        }

        public Criteria andGymxGreaterThan(String value) {
            addCriterion("GYMX >", value, "gymx");
            return (Criteria) this;
        }

        public Criteria andGymxGreaterThanOrEqualTo(String value) {
            addCriterion("GYMX >=", value, "gymx");
            return (Criteria) this;
        }

        public Criteria andGymxLessThan(String value) {
            addCriterion("GYMX <", value, "gymx");
            return (Criteria) this;
        }

        public Criteria andGymxLessThanOrEqualTo(String value) {
            addCriterion("GYMX <=", value, "gymx");
            return (Criteria) this;
        }

        public Criteria andGymxLike(String value) {
            addCriterion("GYMX like", value, "gymx");
            return (Criteria) this;
        }

        public Criteria andGymxNotLike(String value) {
            addCriterion("GYMX not like", value, "gymx");
            return (Criteria) this;
        }

        public Criteria andGymxIn(List<String> values) {
            addCriterion("GYMX in", values, "gymx");
            return (Criteria) this;
        }

        public Criteria andGymxNotIn(List<String> values) {
            addCriterion("GYMX not in", values, "gymx");
            return (Criteria) this;
        }

        public Criteria andGymxBetween(String value1, String value2) {
            addCriterion("GYMX between", value1, value2, "gymx");
            return (Criteria) this;
        }

        public Criteria andGymxNotBetween(String value1, String value2) {
            addCriterion("GYMX not between", value1, value2, "gymx");
            return (Criteria) this;
        }

        public Criteria andFylxIsNull() {
            addCriterion("fylx is null");
            return (Criteria) this;
        }

        public Criteria andFylxIsNotNull() {
            addCriterion("fylx is not null");
            return (Criteria) this;
        }

        public Criteria andFylxEqualTo(String value) {
            addCriterion("fylx =", value, "fylx");
            return (Criteria) this;
        }

        public Criteria andFylxNotEqualTo(String value) {
            addCriterion("fylx <>", value, "fylx");
            return (Criteria) this;
        }

        public Criteria andFylxGreaterThan(String value) {
            addCriterion("fylx >", value, "fylx");
            return (Criteria) this;
        }

        public Criteria andFylxGreaterThanOrEqualTo(String value) {
            addCriterion("fylx >=", value, "fylx");
            return (Criteria) this;
        }

        public Criteria andFylxLessThan(String value) {
            addCriterion("fylx <", value, "fylx");
            return (Criteria) this;
        }

        public Criteria andFylxLessThanOrEqualTo(String value) {
            addCriterion("fylx <=", value, "fylx");
            return (Criteria) this;
        }

        public Criteria andFylxLike(String value) {
            addCriterion("fylx like", value, "fylx");
            return (Criteria) this;
        }

        public Criteria andFylxNotLike(String value) {
            addCriterion("fylx not like", value, "fylx");
            return (Criteria) this;
        }

        public Criteria andFylxIn(List<String> values) {
            addCriterion("fylx in", values, "fylx");
            return (Criteria) this;
        }

        public Criteria andFylxNotIn(List<String> values) {
            addCriterion("fylx not in", values, "fylx");
            return (Criteria) this;
        }

        public Criteria andFylxBetween(String value1, String value2) {
            addCriterion("fylx between", value1, value2, "fylx");
            return (Criteria) this;
        }

        public Criteria andFylxNotBetween(String value1, String value2) {
            addCriterion("fylx not between", value1, value2, "fylx");
            return (Criteria) this;
        }

        public Criteria andXwhcdIsNull() {
            addCriterion("XWHCD is null");
            return (Criteria) this;
        }

        public Criteria andXwhcdIsNotNull() {
            addCriterion("XWHCD is not null");
            return (Criteria) this;
        }

        public Criteria andXwhcdEqualTo(String value) {
            addCriterion("XWHCD =", value, "xwhcd");
            return (Criteria) this;
        }

        public Criteria andXwhcdNotEqualTo(String value) {
            addCriterion("XWHCD <>", value, "xwhcd");
            return (Criteria) this;
        }

        public Criteria andXwhcdGreaterThan(String value) {
            addCriterion("XWHCD >", value, "xwhcd");
            return (Criteria) this;
        }

        public Criteria andXwhcdGreaterThanOrEqualTo(String value) {
            addCriterion("XWHCD >=", value, "xwhcd");
            return (Criteria) this;
        }

        public Criteria andXwhcdLessThan(String value) {
            addCriterion("XWHCD <", value, "xwhcd");
            return (Criteria) this;
        }

        public Criteria andXwhcdLessThanOrEqualTo(String value) {
            addCriterion("XWHCD <=", value, "xwhcd");
            return (Criteria) this;
        }

        public Criteria andXwhcdLike(String value) {
            addCriterion("XWHCD like", value, "xwhcd");
            return (Criteria) this;
        }

        public Criteria andXwhcdNotLike(String value) {
            addCriterion("XWHCD not like", value, "xwhcd");
            return (Criteria) this;
        }

        public Criteria andXwhcdIn(List<String> values) {
            addCriterion("XWHCD in", values, "xwhcd");
            return (Criteria) this;
        }

        public Criteria andXwhcdNotIn(List<String> values) {
            addCriterion("XWHCD not in", values, "xwhcd");
            return (Criteria) this;
        }

        public Criteria andXwhcdBetween(String value1, String value2) {
            addCriterion("XWHCD between", value1, value2, "xwhcd");
            return (Criteria) this;
        }

        public Criteria andXwhcdNotBetween(String value1, String value2) {
            addCriterion("XWHCD not between", value1, value2, "xwhcd");
            return (Criteria) this;
        }

        public Criteria andZyztIsNull() {
            addCriterion("zyzt is null");
            return (Criteria) this;
        }

        public Criteria andZyztIsNotNull() {
            addCriterion("zyzt is not null");
            return (Criteria) this;
        }

        public Criteria andZyztEqualTo(String value) {
            addCriterion("zyzt =", value, "zyzt");
            return (Criteria) this;
        }

        public Criteria andZyztNotEqualTo(String value) {
            addCriterion("zyzt <>", value, "zyzt");
            return (Criteria) this;
        }

        public Criteria andZyztGreaterThan(String value) {
            addCriterion("zyzt >", value, "zyzt");
            return (Criteria) this;
        }

        public Criteria andZyztGreaterThanOrEqualTo(String value) {
            addCriterion("zyzt >=", value, "zyzt");
            return (Criteria) this;
        }

        public Criteria andZyztLessThan(String value) {
            addCriterion("zyzt <", value, "zyzt");
            return (Criteria) this;
        }

        public Criteria andZyztLessThanOrEqualTo(String value) {
            addCriterion("zyzt <=", value, "zyzt");
            return (Criteria) this;
        }

        public Criteria andZyztLike(String value) {
            addCriterion("zyzt like", value, "zyzt");
            return (Criteria) this;
        }

        public Criteria andZyztNotLike(String value) {
            addCriterion("zyzt not like", value, "zyzt");
            return (Criteria) this;
        }

        public Criteria andZyztIn(List<String> values) {
            addCriterion("zyzt in", values, "zyzt");
            return (Criteria) this;
        }

        public Criteria andZyztNotIn(List<String> values) {
            addCriterion("zyzt not in", values, "zyzt");
            return (Criteria) this;
        }

        public Criteria andZyztBetween(String value1, String value2) {
            addCriterion("zyzt between", value1, value2, "zyzt");
            return (Criteria) this;
        }

        public Criteria andZyztNotBetween(String value1, String value2) {
            addCriterion("zyzt not between", value1, value2, "zyzt");
            return (Criteria) this;
        }

        public Criteria andJcxmIsNull() {
            addCriterion("jcxm is null");
            return (Criteria) this;
        }

        public Criteria andJcxmIsNotNull() {
            addCriterion("jcxm is not null");
            return (Criteria) this;
        }

        public Criteria andJcxmEqualTo(String value) {
            addCriterion("jcxm =", value, "jcxm");
            return (Criteria) this;
        }

        public Criteria andJcxmNotEqualTo(String value) {
            addCriterion("jcxm <>", value, "jcxm");
            return (Criteria) this;
        }

        public Criteria andJcxmGreaterThan(String value) {
            addCriterion("jcxm >", value, "jcxm");
            return (Criteria) this;
        }

        public Criteria andJcxmGreaterThanOrEqualTo(String value) {
            addCriterion("jcxm >=", value, "jcxm");
            return (Criteria) this;
        }

        public Criteria andJcxmLessThan(String value) {
            addCriterion("jcxm <", value, "jcxm");
            return (Criteria) this;
        }

        public Criteria andJcxmLessThanOrEqualTo(String value) {
            addCriterion("jcxm <=", value, "jcxm");
            return (Criteria) this;
        }

        public Criteria andJcxmLike(String value) {
            addCriterion("jcxm like", value, "jcxm");
            return (Criteria) this;
        }

        public Criteria andJcxmNotLike(String value) {
            addCriterion("jcxm not like", value, "jcxm");
            return (Criteria) this;
        }

        public Criteria andJcxmIn(List<String> values) {
            addCriterion("jcxm in", values, "jcxm");
            return (Criteria) this;
        }

        public Criteria andJcxmNotIn(List<String> values) {
            addCriterion("jcxm not in", values, "jcxm");
            return (Criteria) this;
        }

        public Criteria andJcxmBetween(String value1, String value2) {
            addCriterion("jcxm between", value1, value2, "jcxm");
            return (Criteria) this;
        }

        public Criteria andJcxmNotBetween(String value1, String value2) {
            addCriterion("jcxm not between", value1, value2, "jcxm");
            return (Criteria) this;
        }

        public Criteria andFgdjIsNull() {
            addCriterion("FGDJ is null");
            return (Criteria) this;
        }

        public Criteria andFgdjIsNotNull() {
            addCriterion("FGDJ is not null");
            return (Criteria) this;
        }

        public Criteria andFgdjEqualTo(String value) {
            addCriterion("FGDJ =", value, "fgdj");
            return (Criteria) this;
        }

        public Criteria andFgdjNotEqualTo(String value) {
            addCriterion("FGDJ <>", value, "fgdj");
            return (Criteria) this;
        }

        public Criteria andFgdjGreaterThan(String value) {
            addCriterion("FGDJ >", value, "fgdj");
            return (Criteria) this;
        }

        public Criteria andFgdjGreaterThanOrEqualTo(String value) {
            addCriterion("FGDJ >=", value, "fgdj");
            return (Criteria) this;
        }

        public Criteria andFgdjLessThan(String value) {
            addCriterion("FGDJ <", value, "fgdj");
            return (Criteria) this;
        }

        public Criteria andFgdjLessThanOrEqualTo(String value) {
            addCriterion("FGDJ <=", value, "fgdj");
            return (Criteria) this;
        }

        public Criteria andFgdjLike(String value) {
            addCriterion("FGDJ like", value, "fgdj");
            return (Criteria) this;
        }

        public Criteria andFgdjNotLike(String value) {
            addCriterion("FGDJ not like", value, "fgdj");
            return (Criteria) this;
        }

        public Criteria andFgdjIn(List<String> values) {
            addCriterion("FGDJ in", values, "fgdj");
            return (Criteria) this;
        }

        public Criteria andFgdjNotIn(List<String> values) {
            addCriterion("FGDJ not in", values, "fgdj");
            return (Criteria) this;
        }

        public Criteria andFgdjBetween(String value1, String value2) {
            addCriterion("FGDJ between", value1, value2, "fgdj");
            return (Criteria) this;
        }

        public Criteria andFgdjNotBetween(String value1, String value2) {
            addCriterion("FGDJ not between", value1, value2, "fgdj");
            return (Criteria) this;
        }

        public Criteria andTbgzlbIsNull() {
            addCriterion("tbgzlb is null");
            return (Criteria) this;
        }

        public Criteria andTbgzlbIsNotNull() {
            addCriterion("tbgzlb is not null");
            return (Criteria) this;
        }

        public Criteria andTbgzlbEqualTo(String value) {
            addCriterion("tbgzlb =", value, "tbgzlb");
            return (Criteria) this;
        }

        public Criteria andTbgzlbNotEqualTo(String value) {
            addCriterion("tbgzlb <>", value, "tbgzlb");
            return (Criteria) this;
        }

        public Criteria andTbgzlbGreaterThan(String value) {
            addCriterion("tbgzlb >", value, "tbgzlb");
            return (Criteria) this;
        }

        public Criteria andTbgzlbGreaterThanOrEqualTo(String value) {
            addCriterion("tbgzlb >=", value, "tbgzlb");
            return (Criteria) this;
        }

        public Criteria andTbgzlbLessThan(String value) {
            addCriterion("tbgzlb <", value, "tbgzlb");
            return (Criteria) this;
        }

        public Criteria andTbgzlbLessThanOrEqualTo(String value) {
            addCriterion("tbgzlb <=", value, "tbgzlb");
            return (Criteria) this;
        }

        public Criteria andTbgzlbLike(String value) {
            addCriterion("tbgzlb like", value, "tbgzlb");
            return (Criteria) this;
        }

        public Criteria andTbgzlbNotLike(String value) {
            addCriterion("tbgzlb not like", value, "tbgzlb");
            return (Criteria) this;
        }

        public Criteria andTbgzlbIn(List<String> values) {
            addCriterion("tbgzlb in", values, "tbgzlb");
            return (Criteria) this;
        }

        public Criteria andTbgzlbNotIn(List<String> values) {
            addCriterion("tbgzlb not in", values, "tbgzlb");
            return (Criteria) this;
        }

        public Criteria andTbgzlbBetween(String value1, String value2) {
            addCriterion("tbgzlb between", value1, value2, "tbgzlb");
            return (Criteria) this;
        }

        public Criteria andTbgzlbNotBetween(String value1, String value2) {
            addCriterion("tbgzlb not between", value1, value2, "tbgzlb");
            return (Criteria) this;
        }

        public Criteria andGycsbdpzrqIsNull() {
            addCriterion("gycsbdPZRQ is null");
            return (Criteria) this;
        }

        public Criteria andGycsbdpzrqIsNotNull() {
            addCriterion("gycsbdPZRQ is not null");
            return (Criteria) this;
        }

        public Criteria andGycsbdpzrqEqualTo(Date value) {
            addCriterion("gycsbdPZRQ =", value, "gycsbdpzrq");
            return (Criteria) this;
        }

        public Criteria andGycsbdpzrqNotEqualTo(Date value) {
            addCriterion("gycsbdPZRQ <>", value, "gycsbdpzrq");
            return (Criteria) this;
        }

        public Criteria andGycsbdpzrqGreaterThan(Date value) {
            addCriterion("gycsbdPZRQ >", value, "gycsbdpzrq");
            return (Criteria) this;
        }

        public Criteria andGycsbdpzrqGreaterThanOrEqualTo(Date value) {
            addCriterion("gycsbdPZRQ >=", value, "gycsbdpzrq");
            return (Criteria) this;
        }

        public Criteria andGycsbdpzrqLessThan(Date value) {
            addCriterion("gycsbdPZRQ <", value, "gycsbdpzrq");
            return (Criteria) this;
        }

        public Criteria andGycsbdpzrqLessThanOrEqualTo(Date value) {
            addCriterion("gycsbdPZRQ <=", value, "gycsbdpzrq");
            return (Criteria) this;
        }

        public Criteria andGycsbdpzrqIn(List<Date> values) {
            addCriterion("gycsbdPZRQ in", values, "gycsbdpzrq");
            return (Criteria) this;
        }

        public Criteria andGycsbdpzrqNotIn(List<Date> values) {
            addCriterion("gycsbdPZRQ not in", values, "gycsbdpzrq");
            return (Criteria) this;
        }

        public Criteria andGycsbdpzrqBetween(Date value1, Date value2) {
            addCriterion("gycsbdPZRQ between", value1, value2, "gycsbdpzrq");
            return (Criteria) this;
        }

        public Criteria andGycsbdpzrqNotBetween(Date value1, Date value2) {
            addCriterion("gycsbdPZRQ not between", value1, value2, "gycsbdpzrq");
            return (Criteria) this;
        }

        public Criteria andDlzhIsNull() {
            addCriterion("DLZH is null");
            return (Criteria) this;
        }

        public Criteria andDlzhIsNotNull() {
            addCriterion("DLZH is not null");
            return (Criteria) this;
        }

        public Criteria andDlzhEqualTo(String value) {
            addCriterion("DLZH =", value, "dlzh");
            return (Criteria) this;
        }

        public Criteria andDlzhNotEqualTo(String value) {
            addCriterion("DLZH <>", value, "dlzh");
            return (Criteria) this;
        }

        public Criteria andDlzhGreaterThan(String value) {
            addCriterion("DLZH >", value, "dlzh");
            return (Criteria) this;
        }

        public Criteria andDlzhGreaterThanOrEqualTo(String value) {
            addCriterion("DLZH >=", value, "dlzh");
            return (Criteria) this;
        }

        public Criteria andDlzhLessThan(String value) {
            addCriterion("DLZH <", value, "dlzh");
            return (Criteria) this;
        }

        public Criteria andDlzhLessThanOrEqualTo(String value) {
            addCriterion("DLZH <=", value, "dlzh");
            return (Criteria) this;
        }

        public Criteria andDlzhLike(String value) {
            addCriterion("DLZH like", value, "dlzh");
            return (Criteria) this;
        }

        public Criteria andDlzhNotLike(String value) {
            addCriterion("DLZH not like", value, "dlzh");
            return (Criteria) this;
        }

        public Criteria andDlzhIn(List<String> values) {
            addCriterion("DLZH in", values, "dlzh");
            return (Criteria) this;
        }

        public Criteria andDlzhNotIn(List<String> values) {
            addCriterion("DLZH not in", values, "dlzh");
            return (Criteria) this;
        }

        public Criteria andDlzhBetween(String value1, String value2) {
            addCriterion("DLZH between", value1, value2, "dlzh");
            return (Criteria) this;
        }

        public Criteria andDlzhNotBetween(String value1, String value2) {
            addCriterion("DLZH not between", value1, value2, "dlzh");
            return (Criteria) this;
        }

        public Criteria andFgdjbdpzrqIsNull() {
            addCriterion("fgdjbdPZRQ is null");
            return (Criteria) this;
        }

        public Criteria andFgdjbdpzrqIsNotNull() {
            addCriterion("fgdjbdPZRQ is not null");
            return (Criteria) this;
        }

        public Criteria andFgdjbdpzrqEqualTo(Date value) {
            addCriterion("fgdjbdPZRQ =", value, "fgdjbdpzrq");
            return (Criteria) this;
        }

        public Criteria andFgdjbdpzrqNotEqualTo(Date value) {
            addCriterion("fgdjbdPZRQ <>", value, "fgdjbdpzrq");
            return (Criteria) this;
        }

        public Criteria andFgdjbdpzrqGreaterThan(Date value) {
            addCriterion("fgdjbdPZRQ >", value, "fgdjbdpzrq");
            return (Criteria) this;
        }

        public Criteria andFgdjbdpzrqGreaterThanOrEqualTo(Date value) {
            addCriterion("fgdjbdPZRQ >=", value, "fgdjbdpzrq");
            return (Criteria) this;
        }

        public Criteria andFgdjbdpzrqLessThan(Date value) {
            addCriterion("fgdjbdPZRQ <", value, "fgdjbdpzrq");
            return (Criteria) this;
        }

        public Criteria andFgdjbdpzrqLessThanOrEqualTo(Date value) {
            addCriterion("fgdjbdPZRQ <=", value, "fgdjbdpzrq");
            return (Criteria) this;
        }

        public Criteria andFgdjbdpzrqIn(List<Date> values) {
            addCriterion("fgdjbdPZRQ in", values, "fgdjbdpzrq");
            return (Criteria) this;
        }

        public Criteria andFgdjbdpzrqNotIn(List<Date> values) {
            addCriterion("fgdjbdPZRQ not in", values, "fgdjbdpzrq");
            return (Criteria) this;
        }

        public Criteria andFgdjbdpzrqBetween(Date value1, Date value2) {
            addCriterion("fgdjbdPZRQ between", value1, value2, "fgdjbdpzrq");
            return (Criteria) this;
        }

        public Criteria andFgdjbdpzrqNotBetween(Date value1, Date value2) {
            addCriterion("fgdjbdPZRQ not between", value1, value2, "fgdjbdpzrq");
            return (Criteria) this;
        }

        public Criteria andQfgdjIsNull() {
            addCriterion("QFGDJ is null");
            return (Criteria) this;
        }

        public Criteria andQfgdjIsNotNull() {
            addCriterion("QFGDJ is not null");
            return (Criteria) this;
        }

        public Criteria andQfgdjEqualTo(String value) {
            addCriterion("QFGDJ =", value, "qfgdj");
            return (Criteria) this;
        }

        public Criteria andQfgdjNotEqualTo(String value) {
            addCriterion("QFGDJ <>", value, "qfgdj");
            return (Criteria) this;
        }

        public Criteria andQfgdjGreaterThan(String value) {
            addCriterion("QFGDJ >", value, "qfgdj");
            return (Criteria) this;
        }

        public Criteria andQfgdjGreaterThanOrEqualTo(String value) {
            addCriterion("QFGDJ >=", value, "qfgdj");
            return (Criteria) this;
        }

        public Criteria andQfgdjLessThan(String value) {
            addCriterion("QFGDJ <", value, "qfgdj");
            return (Criteria) this;
        }

        public Criteria andQfgdjLessThanOrEqualTo(String value) {
            addCriterion("QFGDJ <=", value, "qfgdj");
            return (Criteria) this;
        }

        public Criteria andQfgdjLike(String value) {
            addCriterion("QFGDJ like", value, "qfgdj");
            return (Criteria) this;
        }

        public Criteria andQfgdjNotLike(String value) {
            addCriterion("QFGDJ not like", value, "qfgdj");
            return (Criteria) this;
        }

        public Criteria andQfgdjIn(List<String> values) {
            addCriterion("QFGDJ in", values, "qfgdj");
            return (Criteria) this;
        }

        public Criteria andQfgdjNotIn(List<String> values) {
            addCriterion("QFGDJ not in", values, "qfgdj");
            return (Criteria) this;
        }

        public Criteria andQfgdjBetween(String value1, String value2) {
            addCriterion("QFGDJ between", value1, value2, "qfgdj");
            return (Criteria) this;
        }

        public Criteria andQfgdjNotBetween(String value1, String value2) {
            addCriterion("QFGDJ not between", value1, value2, "qfgdj");
            return (Criteria) this;
        }

        public Criteria andHfgdjIsNull() {
            addCriterion("HFGDJ is null");
            return (Criteria) this;
        }

        public Criteria andHfgdjIsNotNull() {
            addCriterion("HFGDJ is not null");
            return (Criteria) this;
        }

        public Criteria andHfgdjEqualTo(String value) {
            addCriterion("HFGDJ =", value, "hfgdj");
            return (Criteria) this;
        }

        public Criteria andHfgdjNotEqualTo(String value) {
            addCriterion("HFGDJ <>", value, "hfgdj");
            return (Criteria) this;
        }

        public Criteria andHfgdjGreaterThan(String value) {
            addCriterion("HFGDJ >", value, "hfgdj");
            return (Criteria) this;
        }

        public Criteria andHfgdjGreaterThanOrEqualTo(String value) {
            addCriterion("HFGDJ >=", value, "hfgdj");
            return (Criteria) this;
        }

        public Criteria andHfgdjLessThan(String value) {
            addCriterion("HFGDJ <", value, "hfgdj");
            return (Criteria) this;
        }

        public Criteria andHfgdjLessThanOrEqualTo(String value) {
            addCriterion("HFGDJ <=", value, "hfgdj");
            return (Criteria) this;
        }

        public Criteria andHfgdjLike(String value) {
            addCriterion("HFGDJ like", value, "hfgdj");
            return (Criteria) this;
        }

        public Criteria andHfgdjNotLike(String value) {
            addCriterion("HFGDJ not like", value, "hfgdj");
            return (Criteria) this;
        }

        public Criteria andHfgdjIn(List<String> values) {
            addCriterion("HFGDJ in", values, "hfgdj");
            return (Criteria) this;
        }

        public Criteria andHfgdjNotIn(List<String> values) {
            addCriterion("HFGDJ not in", values, "hfgdj");
            return (Criteria) this;
        }

        public Criteria andHfgdjBetween(String value1, String value2) {
            addCriterion("HFGDJ between", value1, value2, "hfgdj");
            return (Criteria) this;
        }

        public Criteria andHfgdjNotBetween(String value1, String value2) {
            addCriterion("HFGDJ not between", value1, value2, "hfgdj");
            return (Criteria) this;
        }

        public Criteria andBzIsNull() {
            addCriterion("BZ is null");
            return (Criteria) this;
        }

        public Criteria andBzIsNotNull() {
            addCriterion("BZ is not null");
            return (Criteria) this;
        }

        public Criteria andBzEqualTo(String value) {
            addCriterion("BZ =", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzNotEqualTo(String value) {
            addCriterion("BZ <>", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzGreaterThan(String value) {
            addCriterion("BZ >", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzGreaterThanOrEqualTo(String value) {
            addCriterion("BZ >=", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzLessThan(String value) {
            addCriterion("BZ <", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzLessThanOrEqualTo(String value) {
            addCriterion("BZ <=", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzLike(String value) {
            addCriterion("BZ like", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzNotLike(String value) {
            addCriterion("BZ not like", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzIn(List<String> values) {
            addCriterion("BZ in", values, "bz");
            return (Criteria) this;
        }

        public Criteria andBzNotIn(List<String> values) {
            addCriterion("BZ not in", values, "bz");
            return (Criteria) this;
        }

        public Criteria andBzBetween(String value1, String value2) {
            addCriterion("BZ between", value1, value2, "bz");
            return (Criteria) this;
        }

        public Criteria andBzNotBetween(String value1, String value2) {
            addCriterion("BZ not between", value1, value2, "bz");
            return (Criteria) this;
        }

        public Criteria andYzjlcbrqIsNull() {
            addCriterion("yzjlCBRQ is null");
            return (Criteria) this;
        }

        public Criteria andYzjlcbrqIsNotNull() {
            addCriterion("yzjlCBRQ is not null");
            return (Criteria) this;
        }

        public Criteria andYzjlcbrqEqualTo(Date value) {
            addCriterion("yzjlCBRQ =", value, "yzjlcbrq");
            return (Criteria) this;
        }

        public Criteria andYzjlcbrqNotEqualTo(Date value) {
            addCriterion("yzjlCBRQ <>", value, "yzjlcbrq");
            return (Criteria) this;
        }

        public Criteria andYzjlcbrqGreaterThan(Date value) {
            addCriterion("yzjlCBRQ >", value, "yzjlcbrq");
            return (Criteria) this;
        }

        public Criteria andYzjlcbrqGreaterThanOrEqualTo(Date value) {
            addCriterion("yzjlCBRQ >=", value, "yzjlcbrq");
            return (Criteria) this;
        }

        public Criteria andYzjlcbrqLessThan(Date value) {
            addCriterion("yzjlCBRQ <", value, "yzjlcbrq");
            return (Criteria) this;
        }

        public Criteria andYzjlcbrqLessThanOrEqualTo(Date value) {
            addCriterion("yzjlCBRQ <=", value, "yzjlcbrq");
            return (Criteria) this;
        }

        public Criteria andYzjlcbrqIn(List<Date> values) {
            addCriterion("yzjlCBRQ in", values, "yzjlcbrq");
            return (Criteria) this;
        }

        public Criteria andYzjlcbrqNotIn(List<Date> values) {
            addCriterion("yzjlCBRQ not in", values, "yzjlcbrq");
            return (Criteria) this;
        }

        public Criteria andYzjlcbrqBetween(Date value1, Date value2) {
            addCriterion("yzjlCBRQ between", value1, value2, "yzjlcbrq");
            return (Criteria) this;
        }

        public Criteria andYzjlcbrqNotBetween(Date value1, Date value2) {
            addCriterion("yzjlCBRQ not between", value1, value2, "yzjlcbrq");
            return (Criteria) this;
        }

        public Criteria andYzjlpzrqIsNull() {
            addCriterion("yzjlPZRQ is null");
            return (Criteria) this;
        }

        public Criteria andYzjlpzrqIsNotNull() {
            addCriterion("yzjlPZRQ is not null");
            return (Criteria) this;
        }

        public Criteria andYzjlpzrqEqualTo(Date value) {
            addCriterion("yzjlPZRQ =", value, "yzjlpzrq");
            return (Criteria) this;
        }

        public Criteria andYzjlpzrqNotEqualTo(Date value) {
            addCriterion("yzjlPZRQ <>", value, "yzjlpzrq");
            return (Criteria) this;
        }

        public Criteria andYzjlpzrqGreaterThan(Date value) {
            addCriterion("yzjlPZRQ >", value, "yzjlpzrq");
            return (Criteria) this;
        }

        public Criteria andYzjlpzrqGreaterThanOrEqualTo(Date value) {
            addCriterion("yzjlPZRQ >=", value, "yzjlpzrq");
            return (Criteria) this;
        }

        public Criteria andYzjlpzrqLessThan(Date value) {
            addCriterion("yzjlPZRQ <", value, "yzjlpzrq");
            return (Criteria) this;
        }

        public Criteria andYzjlpzrqLessThanOrEqualTo(Date value) {
            addCriterion("yzjlPZRQ <=", value, "yzjlpzrq");
            return (Criteria) this;
        }

        public Criteria andYzjlpzrqIn(List<Date> values) {
            addCriterion("yzjlPZRQ in", values, "yzjlpzrq");
            return (Criteria) this;
        }

        public Criteria andYzjlpzrqNotIn(List<Date> values) {
            addCriterion("yzjlPZRQ not in", values, "yzjlpzrq");
            return (Criteria) this;
        }

        public Criteria andYzjlpzrqBetween(Date value1, Date value2) {
            addCriterion("yzjlPZRQ between", value1, value2, "yzjlpzrq");
            return (Criteria) this;
        }

        public Criteria andYzjlpzrqNotBetween(Date value1, Date value2) {
            addCriterion("yzjlPZRQ not between", value1, value2, "yzjlpzrq");
            return (Criteria) this;
        }

        public Criteria andJlyyIsNull() {
            addCriterion("JLYY is null");
            return (Criteria) this;
        }

        public Criteria andJlyyIsNotNull() {
            addCriterion("JLYY is not null");
            return (Criteria) this;
        }

        public Criteria andJlyyEqualTo(String value) {
            addCriterion("JLYY =", value, "jlyy");
            return (Criteria) this;
        }

        public Criteria andJlyyNotEqualTo(String value) {
            addCriterion("JLYY <>", value, "jlyy");
            return (Criteria) this;
        }

        public Criteria andJlyyGreaterThan(String value) {
            addCriterion("JLYY >", value, "jlyy");
            return (Criteria) this;
        }

        public Criteria andJlyyGreaterThanOrEqualTo(String value) {
            addCriterion("JLYY >=", value, "jlyy");
            return (Criteria) this;
        }

        public Criteria andJlyyLessThan(String value) {
            addCriterion("JLYY <", value, "jlyy");
            return (Criteria) this;
        }

        public Criteria andJlyyLessThanOrEqualTo(String value) {
            addCriterion("JLYY <=", value, "jlyy");
            return (Criteria) this;
        }

        public Criteria andJlyyLike(String value) {
            addCriterion("JLYY like", value, "jlyy");
            return (Criteria) this;
        }

        public Criteria andJlyyNotLike(String value) {
            addCriterion("JLYY not like", value, "jlyy");
            return (Criteria) this;
        }

        public Criteria andJlyyIn(List<String> values) {
            addCriterion("JLYY in", values, "jlyy");
            return (Criteria) this;
        }

        public Criteria andJlyyNotIn(List<String> values) {
            addCriterion("JLYY not in", values, "jlyy");
            return (Criteria) this;
        }

        public Criteria andJlyyBetween(String value1, String value2) {
            addCriterion("JLYY between", value1, value2, "jlyy");
            return (Criteria) this;
        }

        public Criteria andJlyyNotBetween(String value1, String value2) {
            addCriterion("JLYY not between", value1, value2, "jlyy");
            return (Criteria) this;
        }

        public Criteria andYyjxIsNull() {
            addCriterion("YYJX is null");
            return (Criteria) this;
        }

        public Criteria andYyjxIsNotNull() {
            addCriterion("YYJX is not null");
            return (Criteria) this;
        }

        public Criteria andYyjxEqualTo(String value) {
            addCriterion("YYJX =", value, "yyjx");
            return (Criteria) this;
        }

        public Criteria andYyjxNotEqualTo(String value) {
            addCriterion("YYJX <>", value, "yyjx");
            return (Criteria) this;
        }

        public Criteria andYyjxGreaterThan(String value) {
            addCriterion("YYJX >", value, "yyjx");
            return (Criteria) this;
        }

        public Criteria andYyjxGreaterThanOrEqualTo(String value) {
            addCriterion("YYJX >=", value, "yyjx");
            return (Criteria) this;
        }

        public Criteria andYyjxLessThan(String value) {
            addCriterion("YYJX <", value, "yyjx");
            return (Criteria) this;
        }

        public Criteria andYyjxLessThanOrEqualTo(String value) {
            addCriterion("YYJX <=", value, "yyjx");
            return (Criteria) this;
        }

        public Criteria andYyjxLike(String value) {
            addCriterion("YYJX like", value, "yyjx");
            return (Criteria) this;
        }

        public Criteria andYyjxNotLike(String value) {
            addCriterion("YYJX not like", value, "yyjx");
            return (Criteria) this;
        }

        public Criteria andYyjxIn(List<String> values) {
            addCriterion("YYJX in", values, "yyjx");
            return (Criteria) this;
        }

        public Criteria andYyjxNotIn(List<String> values) {
            addCriterion("YYJX not in", values, "yyjx");
            return (Criteria) this;
        }

        public Criteria andYyjxBetween(String value1, String value2) {
            addCriterion("YYJX between", value1, value2, "yyjx");
            return (Criteria) this;
        }

        public Criteria andYyjxNotBetween(String value1, String value2) {
            addCriterion("YYJX not between", value1, value2, "yyjx");
            return (Criteria) this;
        }

        public Criteria andYzjlbzIsNull() {
            addCriterion("yzjlbz is null");
            return (Criteria) this;
        }

        public Criteria andYzjlbzIsNotNull() {
            addCriterion("yzjlbz is not null");
            return (Criteria) this;
        }

        public Criteria andYzjlbzEqualTo(String value) {
            addCriterion("yzjlbz =", value, "yzjlbz");
            return (Criteria) this;
        }

        public Criteria andYzjlbzNotEqualTo(String value) {
            addCriterion("yzjlbz <>", value, "yzjlbz");
            return (Criteria) this;
        }

        public Criteria andYzjlbzGreaterThan(String value) {
            addCriterion("yzjlbz >", value, "yzjlbz");
            return (Criteria) this;
        }

        public Criteria andYzjlbzGreaterThanOrEqualTo(String value) {
            addCriterion("yzjlbz >=", value, "yzjlbz");
            return (Criteria) this;
        }

        public Criteria andYzjlbzLessThan(String value) {
            addCriterion("yzjlbz <", value, "yzjlbz");
            return (Criteria) this;
        }

        public Criteria andYzjlbzLessThanOrEqualTo(String value) {
            addCriterion("yzjlbz <=", value, "yzjlbz");
            return (Criteria) this;
        }

        public Criteria andYzjlbzLike(String value) {
            addCriterion("yzjlbz like", value, "yzjlbz");
            return (Criteria) this;
        }

        public Criteria andYzjlbzNotLike(String value) {
            addCriterion("yzjlbz not like", value, "yzjlbz");
            return (Criteria) this;
        }

        public Criteria andYzjlbzIn(List<String> values) {
            addCriterion("yzjlbz in", values, "yzjlbz");
            return (Criteria) this;
        }

        public Criteria andYzjlbzNotIn(List<String> values) {
            addCriterion("yzjlbz not in", values, "yzjlbz");
            return (Criteria) this;
        }

        public Criteria andYzjlbzBetween(String value1, String value2) {
            addCriterion("yzjlbz between", value1, value2, "yzjlbz");
            return (Criteria) this;
        }

        public Criteria andYzjlbzNotBetween(String value1, String value2) {
            addCriterion("yzjlbz not between", value1, value2, "yzjlbz");
            return (Criteria) this;
        }

        public Criteria andYzcccbrqIsNull() {
            addCriterion("yzccCBRQ is null");
            return (Criteria) this;
        }

        public Criteria andYzcccbrqIsNotNull() {
            addCriterion("yzccCBRQ is not null");
            return (Criteria) this;
        }

        public Criteria andYzcccbrqEqualTo(Date value) {
            addCriterion("yzccCBRQ =", value, "yzcccbrq");
            return (Criteria) this;
        }

        public Criteria andYzcccbrqNotEqualTo(Date value) {
            addCriterion("yzccCBRQ <>", value, "yzcccbrq");
            return (Criteria) this;
        }

        public Criteria andYzcccbrqGreaterThan(Date value) {
            addCriterion("yzccCBRQ >", value, "yzcccbrq");
            return (Criteria) this;
        }

        public Criteria andYzcccbrqGreaterThanOrEqualTo(Date value) {
            addCriterion("yzccCBRQ >=", value, "yzcccbrq");
            return (Criteria) this;
        }

        public Criteria andYzcccbrqLessThan(Date value) {
            addCriterion("yzccCBRQ <", value, "yzcccbrq");
            return (Criteria) this;
        }

        public Criteria andYzcccbrqLessThanOrEqualTo(Date value) {
            addCriterion("yzccCBRQ <=", value, "yzcccbrq");
            return (Criteria) this;
        }

        public Criteria andYzcccbrqIn(List<Date> values) {
            addCriterion("yzccCBRQ in", values, "yzcccbrq");
            return (Criteria) this;
        }

        public Criteria andYzcccbrqNotIn(List<Date> values) {
            addCriterion("yzccCBRQ not in", values, "yzcccbrq");
            return (Criteria) this;
        }

        public Criteria andYzcccbrqBetween(Date value1, Date value2) {
            addCriterion("yzccCBRQ between", value1, value2, "yzcccbrq");
            return (Criteria) this;
        }

        public Criteria andYzcccbrqNotBetween(Date value1, Date value2) {
            addCriterion("yzccCBRQ not between", value1, value2, "yzcccbrq");
            return (Criteria) this;
        }

        public Criteria andYzccpzrqIsNull() {
            addCriterion("yzccPZRQ is null");
            return (Criteria) this;
        }

        public Criteria andYzccpzrqIsNotNull() {
            addCriterion("yzccPZRQ is not null");
            return (Criteria) this;
        }

        public Criteria andYzccpzrqEqualTo(Date value) {
            addCriterion("yzccPZRQ =", value, "yzccpzrq");
            return (Criteria) this;
        }

        public Criteria andYzccpzrqNotEqualTo(Date value) {
            addCriterion("yzccPZRQ <>", value, "yzccpzrq");
            return (Criteria) this;
        }

        public Criteria andYzccpzrqGreaterThan(Date value) {
            addCriterion("yzccPZRQ >", value, "yzccpzrq");
            return (Criteria) this;
        }

        public Criteria andYzccpzrqGreaterThanOrEqualTo(Date value) {
            addCriterion("yzccPZRQ >=", value, "yzccpzrq");
            return (Criteria) this;
        }

        public Criteria andYzccpzrqLessThan(Date value) {
            addCriterion("yzccPZRQ <", value, "yzccpzrq");
            return (Criteria) this;
        }

        public Criteria andYzccpzrqLessThanOrEqualTo(Date value) {
            addCriterion("yzccPZRQ <=", value, "yzccpzrq");
            return (Criteria) this;
        }

        public Criteria andYzccpzrqIn(List<Date> values) {
            addCriterion("yzccPZRQ in", values, "yzccpzrq");
            return (Criteria) this;
        }

        public Criteria andYzccpzrqNotIn(List<Date> values) {
            addCriterion("yzccPZRQ not in", values, "yzccpzrq");
            return (Criteria) this;
        }

        public Criteria andYzccpzrqBetween(Date value1, Date value2) {
            addCriterion("yzccPZRQ between", value1, value2, "yzccpzrq");
            return (Criteria) this;
        }

        public Criteria andYzccpzrqNotBetween(Date value1, Date value2) {
            addCriterion("yzccPZRQ not between", value1, value2, "yzccpzrq");
            return (Criteria) this;
        }

        public Criteria andCcyyIsNull() {
            addCriterion("ccYY is null");
            return (Criteria) this;
        }

        public Criteria andCcyyIsNotNull() {
            addCriterion("ccYY is not null");
            return (Criteria) this;
        }

        public Criteria andCcyyEqualTo(String value) {
            addCriterion("ccYY =", value, "ccyy");
            return (Criteria) this;
        }

        public Criteria andCcyyNotEqualTo(String value) {
            addCriterion("ccYY <>", value, "ccyy");
            return (Criteria) this;
        }

        public Criteria andCcyyGreaterThan(String value) {
            addCriterion("ccYY >", value, "ccyy");
            return (Criteria) this;
        }

        public Criteria andCcyyGreaterThanOrEqualTo(String value) {
            addCriterion("ccYY >=", value, "ccyy");
            return (Criteria) this;
        }

        public Criteria andCcyyLessThan(String value) {
            addCriterion("ccYY <", value, "ccyy");
            return (Criteria) this;
        }

        public Criteria andCcyyLessThanOrEqualTo(String value) {
            addCriterion("ccYY <=", value, "ccyy");
            return (Criteria) this;
        }

        public Criteria andCcyyLike(String value) {
            addCriterion("ccYY like", value, "ccyy");
            return (Criteria) this;
        }

        public Criteria andCcyyNotLike(String value) {
            addCriterion("ccYY not like", value, "ccyy");
            return (Criteria) this;
        }

        public Criteria andCcyyIn(List<String> values) {
            addCriterion("ccYY in", values, "ccyy");
            return (Criteria) this;
        }

        public Criteria andCcyyNotIn(List<String> values) {
            addCriterion("ccYY not in", values, "ccyy");
            return (Criteria) this;
        }

        public Criteria andCcyyBetween(String value1, String value2) {
            addCriterion("ccYY between", value1, value2, "ccyy");
            return (Criteria) this;
        }

        public Criteria andCcyyNotBetween(String value1, String value2) {
            addCriterion("ccYY not between", value1, value2, "ccyy");
            return (Criteria) this;
        }

        public Criteria andCczrIsNull() {
            addCriterion("CCZR is null");
            return (Criteria) this;
        }

        public Criteria andCczrIsNotNull() {
            addCriterion("CCZR is not null");
            return (Criteria) this;
        }

        public Criteria andCczrEqualTo(Date value) {
            addCriterion("CCZR =", value, "cczr");
            return (Criteria) this;
        }

        public Criteria andCczrNotEqualTo(Date value) {
            addCriterion("CCZR <>", value, "cczr");
            return (Criteria) this;
        }

        public Criteria andCczrGreaterThan(Date value) {
            addCriterion("CCZR >", value, "cczr");
            return (Criteria) this;
        }

        public Criteria andCczrGreaterThanOrEqualTo(Date value) {
            addCriterion("CCZR >=", value, "cczr");
            return (Criteria) this;
        }

        public Criteria andCczrLessThan(Date value) {
            addCriterion("CCZR <", value, "cczr");
            return (Criteria) this;
        }

        public Criteria andCczrLessThanOrEqualTo(Date value) {
            addCriterion("CCZR <=", value, "cczr");
            return (Criteria) this;
        }

        public Criteria andCczrIn(List<Date> values) {
            addCriterion("CCZR in", values, "cczr");
            return (Criteria) this;
        }

        public Criteria andCczrNotIn(List<Date> values) {
            addCriterion("CCZR not in", values, "cczr");
            return (Criteria) this;
        }

        public Criteria andCczrBetween(Date value1, Date value2) {
            addCriterion("CCZR between", value1, value2, "cczr");
            return (Criteria) this;
        }

        public Criteria andCczrNotBetween(Date value1, Date value2) {
            addCriterion("CCZR not between", value1, value2, "cczr");
            return (Criteria) this;
        }

        public Criteria andYzccbzIsNull() {
            addCriterion("yzccbz is null");
            return (Criteria) this;
        }

        public Criteria andYzccbzIsNotNull() {
            addCriterion("yzccbz is not null");
            return (Criteria) this;
        }

        public Criteria andYzccbzEqualTo(String value) {
            addCriterion("yzccbz =", value, "yzccbz");
            return (Criteria) this;
        }

        public Criteria andYzccbzNotEqualTo(String value) {
            addCriterion("yzccbz <>", value, "yzccbz");
            return (Criteria) this;
        }

        public Criteria andYzccbzGreaterThan(String value) {
            addCriterion("yzccbz >", value, "yzccbz");
            return (Criteria) this;
        }

        public Criteria andYzccbzGreaterThanOrEqualTo(String value) {
            addCriterion("yzccbz >=", value, "yzccbz");
            return (Criteria) this;
        }

        public Criteria andYzccbzLessThan(String value) {
            addCriterion("yzccbz <", value, "yzccbz");
            return (Criteria) this;
        }

        public Criteria andYzccbzLessThanOrEqualTo(String value) {
            addCriterion("yzccbz <=", value, "yzccbz");
            return (Criteria) this;
        }

        public Criteria andYzccbzLike(String value) {
            addCriterion("yzccbz like", value, "yzccbz");
            return (Criteria) this;
        }

        public Criteria andYzccbzNotLike(String value) {
            addCriterion("yzccbz not like", value, "yzccbz");
            return (Criteria) this;
        }

        public Criteria andYzccbzIn(List<String> values) {
            addCriterion("yzccbz in", values, "yzccbz");
            return (Criteria) this;
        }

        public Criteria andYzccbzNotIn(List<String> values) {
            addCriterion("yzccbz not in", values, "yzccbz");
            return (Criteria) this;
        }

        public Criteria andYzccbzBetween(String value1, String value2) {
            addCriterion("yzccbz between", value1, value2, "yzccbz");
            return (Criteria) this;
        }

        public Criteria andYzccbzNotBetween(String value1, String value2) {
            addCriterion("yzccbz not between", value1, value2, "yzccbz");
            return (Criteria) this;
        }

        public Criteria andBdlbIsNull() {
            addCriterion("BDLB is null");
            return (Criteria) this;
        }

        public Criteria andBdlbIsNotNull() {
            addCriterion("BDLB is not null");
            return (Criteria) this;
        }

        public Criteria andBdlbEqualTo(String value) {
            addCriterion("BDLB =", value, "bdlb");
            return (Criteria) this;
        }

        public Criteria andBdlbNotEqualTo(String value) {
            addCriterion("BDLB <>", value, "bdlb");
            return (Criteria) this;
        }

        public Criteria andBdlbGreaterThan(String value) {
            addCriterion("BDLB >", value, "bdlb");
            return (Criteria) this;
        }

        public Criteria andBdlbGreaterThanOrEqualTo(String value) {
            addCriterion("BDLB >=", value, "bdlb");
            return (Criteria) this;
        }

        public Criteria andBdlbLessThan(String value) {
            addCriterion("BDLB <", value, "bdlb");
            return (Criteria) this;
        }

        public Criteria andBdlbLessThanOrEqualTo(String value) {
            addCriterion("BDLB <=", value, "bdlb");
            return (Criteria) this;
        }

        public Criteria andBdlbLike(String value) {
            addCriterion("BDLB like", value, "bdlb");
            return (Criteria) this;
        }

        public Criteria andBdlbNotLike(String value) {
            addCriterion("BDLB not like", value, "bdlb");
            return (Criteria) this;
        }

        public Criteria andBdlbIn(List<String> values) {
            addCriterion("BDLB in", values, "bdlb");
            return (Criteria) this;
        }

        public Criteria andBdlbNotIn(List<String> values) {
            addCriterion("BDLB not in", values, "bdlb");
            return (Criteria) this;
        }

        public Criteria andBdlbBetween(String value1, String value2) {
            addCriterion("BDLB between", value1, value2, "bdlb");
            return (Criteria) this;
        }

        public Criteria andBdlbNotBetween(String value1, String value2) {
            addCriterion("BDLB not between", value1, value2, "bdlb");
            return (Criteria) this;
        }

        public Criteria andPcqhIsNull() {
            addCriterion("PCQH is null");
            return (Criteria) this;
        }

        public Criteria andPcqhIsNotNull() {
            addCriterion("PCQH is not null");
            return (Criteria) this;
        }

        public Criteria andPcqhEqualTo(String value) {
            addCriterion("PCQH =", value, "pcqh");
            return (Criteria) this;
        }

        public Criteria andPcqhNotEqualTo(String value) {
            addCriterion("PCQH <>", value, "pcqh");
            return (Criteria) this;
        }

        public Criteria andPcqhGreaterThan(String value) {
            addCriterion("PCQH >", value, "pcqh");
            return (Criteria) this;
        }

        public Criteria andPcqhGreaterThanOrEqualTo(String value) {
            addCriterion("PCQH >=", value, "pcqh");
            return (Criteria) this;
        }

        public Criteria andPcqhLessThan(String value) {
            addCriterion("PCQH <", value, "pcqh");
            return (Criteria) this;
        }

        public Criteria andPcqhLessThanOrEqualTo(String value) {
            addCriterion("PCQH <=", value, "pcqh");
            return (Criteria) this;
        }

        public Criteria andPcqhLike(String value) {
            addCriterion("PCQH like", value, "pcqh");
            return (Criteria) this;
        }

        public Criteria andPcqhNotLike(String value) {
            addCriterion("PCQH not like", value, "pcqh");
            return (Criteria) this;
        }

        public Criteria andPcqhIn(List<String> values) {
            addCriterion("PCQH in", values, "pcqh");
            return (Criteria) this;
        }

        public Criteria andPcqhNotIn(List<String> values) {
            addCriterion("PCQH not in", values, "pcqh");
            return (Criteria) this;
        }

        public Criteria andPcqhBetween(String value1, String value2) {
            addCriterion("PCQH between", value1, value2, "pcqh");
            return (Criteria) this;
        }

        public Criteria andPcqhNotBetween(String value1, String value2) {
            addCriterion("PCQH not between", value1, value2, "pcqh");
            return (Criteria) this;
        }

        public Criteria andPcrqIsNull() {
            addCriterion("PCRQ is null");
            return (Criteria) this;
        }

        public Criteria andPcrqIsNotNull() {
            addCriterion("PCRQ is not null");
            return (Criteria) this;
        }

        public Criteria andPcrqEqualTo(Date value) {
            addCriterion("PCRQ =", value, "pcrq");
            return (Criteria) this;
        }

        public Criteria andPcrqNotEqualTo(Date value) {
            addCriterion("PCRQ <>", value, "pcrq");
            return (Criteria) this;
        }

        public Criteria andPcrqGreaterThan(Date value) {
            addCriterion("PCRQ >", value, "pcrq");
            return (Criteria) this;
        }

        public Criteria andPcrqGreaterThanOrEqualTo(Date value) {
            addCriterion("PCRQ >=", value, "pcrq");
            return (Criteria) this;
        }

        public Criteria andPcrqLessThan(Date value) {
            addCriterion("PCRQ <", value, "pcrq");
            return (Criteria) this;
        }

        public Criteria andPcrqLessThanOrEqualTo(Date value) {
            addCriterion("PCRQ <=", value, "pcrq");
            return (Criteria) this;
        }

        public Criteria andPcrqIn(List<Date> values) {
            addCriterion("PCRQ in", values, "pcrq");
            return (Criteria) this;
        }

        public Criteria andPcrqNotIn(List<Date> values) {
            addCriterion("PCRQ not in", values, "pcrq");
            return (Criteria) this;
        }

        public Criteria andPcrqBetween(Date value1, Date value2) {
            addCriterion("PCRQ between", value1, value2, "pcrq");
            return (Criteria) this;
        }

        public Criteria andPcrqNotBetween(Date value1, Date value2) {
            addCriterion("PCRQ not between", value1, value2, "pcrq");
            return (Criteria) this;
        }

        public Criteria andBdfdIsNull() {
            addCriterion("BDFD is null");
            return (Criteria) this;
        }

        public Criteria andBdfdIsNotNull() {
            addCriterion("BDFD is not null");
            return (Criteria) this;
        }

        public Criteria andBdfdEqualTo(String value) {
            addCriterion("BDFD =", value, "bdfd");
            return (Criteria) this;
        }

        public Criteria andBdfdNotEqualTo(String value) {
            addCriterion("BDFD <>", value, "bdfd");
            return (Criteria) this;
        }

        public Criteria andBdfdGreaterThan(String value) {
            addCriterion("BDFD >", value, "bdfd");
            return (Criteria) this;
        }

        public Criteria andBdfdGreaterThanOrEqualTo(String value) {
            addCriterion("BDFD >=", value, "bdfd");
            return (Criteria) this;
        }

        public Criteria andBdfdLessThan(String value) {
            addCriterion("BDFD <", value, "bdfd");
            return (Criteria) this;
        }

        public Criteria andBdfdLessThanOrEqualTo(String value) {
            addCriterion("BDFD <=", value, "bdfd");
            return (Criteria) this;
        }

        public Criteria andBdfdLike(String value) {
            addCriterion("BDFD like", value, "bdfd");
            return (Criteria) this;
        }

        public Criteria andBdfdNotLike(String value) {
            addCriterion("BDFD not like", value, "bdfd");
            return (Criteria) this;
        }

        public Criteria andBdfdIn(List<String> values) {
            addCriterion("BDFD in", values, "bdfd");
            return (Criteria) this;
        }

        public Criteria andBdfdNotIn(List<String> values) {
            addCriterion("BDFD not in", values, "bdfd");
            return (Criteria) this;
        }

        public Criteria andBdfdBetween(String value1, String value2) {
            addCriterion("BDFD between", value1, value2, "bdfd");
            return (Criteria) this;
        }

        public Criteria andBdfdNotBetween(String value1, String value2) {
            addCriterion("BDFD not between", value1, value2, "bdfd");
            return (Criteria) this;
        }

        public Criteria andXfbdqrIsNull() {
            addCriterion("XFBDQR is null");
            return (Criteria) this;
        }

        public Criteria andXfbdqrIsNotNull() {
            addCriterion("XFBDQR is not null");
            return (Criteria) this;
        }

        public Criteria andXfbdqrEqualTo(Date value) {
            addCriterion("XFBDQR =", value, "xfbdqr");
            return (Criteria) this;
        }

        public Criteria andXfbdqrNotEqualTo(Date value) {
            addCriterion("XFBDQR <>", value, "xfbdqr");
            return (Criteria) this;
        }

        public Criteria andXfbdqrGreaterThan(Date value) {
            addCriterion("XFBDQR >", value, "xfbdqr");
            return (Criteria) this;
        }

        public Criteria andXfbdqrGreaterThanOrEqualTo(Date value) {
            addCriterion("XFBDQR >=", value, "xfbdqr");
            return (Criteria) this;
        }

        public Criteria andXfbdqrLessThan(Date value) {
            addCriterion("XFBDQR <", value, "xfbdqr");
            return (Criteria) this;
        }

        public Criteria andXfbdqrLessThanOrEqualTo(Date value) {
            addCriterion("XFBDQR <=", value, "xfbdqr");
            return (Criteria) this;
        }

        public Criteria andXfbdqrIn(List<Date> values) {
            addCriterion("XFBDQR in", values, "xfbdqr");
            return (Criteria) this;
        }

        public Criteria andXfbdqrNotIn(List<Date> values) {
            addCriterion("XFBDQR not in", values, "xfbdqr");
            return (Criteria) this;
        }

        public Criteria andXfbdqrBetween(Date value1, Date value2) {
            addCriterion("XFBDQR between", value1, value2, "xfbdqr");
            return (Criteria) this;
        }

        public Criteria andXfbdqrNotBetween(Date value1, Date value2) {
            addCriterion("XFBDQR not between", value1, value2, "xfbdqr");
            return (Criteria) this;
        }

        public Criteria andXfbdzrIsNull() {
            addCriterion("XFBDZR is null");
            return (Criteria) this;
        }

        public Criteria andXfbdzrIsNotNull() {
            addCriterion("XFBDZR is not null");
            return (Criteria) this;
        }

        public Criteria andXfbdzrEqualTo(Date value) {
            addCriterion("XFBDZR =", value, "xfbdzr");
            return (Criteria) this;
        }

        public Criteria andXfbdzrNotEqualTo(Date value) {
            addCriterion("XFBDZR <>", value, "xfbdzr");
            return (Criteria) this;
        }

        public Criteria andXfbdzrGreaterThan(Date value) {
            addCriterion("XFBDZR >", value, "xfbdzr");
            return (Criteria) this;
        }

        public Criteria andXfbdzrGreaterThanOrEqualTo(Date value) {
            addCriterion("XFBDZR >=", value, "xfbdzr");
            return (Criteria) this;
        }

        public Criteria andXfbdzrLessThan(Date value) {
            addCriterion("XFBDZR <", value, "xfbdzr");
            return (Criteria) this;
        }

        public Criteria andXfbdzrLessThanOrEqualTo(Date value) {
            addCriterion("XFBDZR <=", value, "xfbdzr");
            return (Criteria) this;
        }

        public Criteria andXfbdzrIn(List<Date> values) {
            addCriterion("XFBDZR in", values, "xfbdzr");
            return (Criteria) this;
        }

        public Criteria andXfbdzrNotIn(List<Date> values) {
            addCriterion("XFBDZR not in", values, "xfbdzr");
            return (Criteria) this;
        }

        public Criteria andXfbdzrBetween(Date value1, Date value2) {
            addCriterion("XFBDZR between", value1, value2, "xfbdzr");
            return (Criteria) this;
        }

        public Criteria andXfbdzrNotBetween(Date value1, Date value2) {
            addCriterion("XFBDZR not between", value1, value2, "xfbdzr");
            return (Criteria) this;
        }

        public Criteria andXfbdbznxIsNull() {
            addCriterion("xfbdBZNX is null");
            return (Criteria) this;
        }

        public Criteria andXfbdbznxIsNotNull() {
            addCriterion("xfbdBZNX is not null");
            return (Criteria) this;
        }

        public Criteria andXfbdbznxEqualTo(String value) {
            addCriterion("xfbdBZNX =", value, "xfbdbznx");
            return (Criteria) this;
        }

        public Criteria andXfbdbznxNotEqualTo(String value) {
            addCriterion("xfbdBZNX <>", value, "xfbdbznx");
            return (Criteria) this;
        }

        public Criteria andXfbdbznxGreaterThan(String value) {
            addCriterion("xfbdBZNX >", value, "xfbdbznx");
            return (Criteria) this;
        }

        public Criteria andXfbdbznxGreaterThanOrEqualTo(String value) {
            addCriterion("xfbdBZNX >=", value, "xfbdbznx");
            return (Criteria) this;
        }

        public Criteria andXfbdbznxLessThan(String value) {
            addCriterion("xfbdBZNX <", value, "xfbdbznx");
            return (Criteria) this;
        }

        public Criteria andXfbdbznxLessThanOrEqualTo(String value) {
            addCriterion("xfbdBZNX <=", value, "xfbdbznx");
            return (Criteria) this;
        }

        public Criteria andXfbdbznxLike(String value) {
            addCriterion("xfbdBZNX like", value, "xfbdbznx");
            return (Criteria) this;
        }

        public Criteria andXfbdbznxNotLike(String value) {
            addCriterion("xfbdBZNX not like", value, "xfbdbznx");
            return (Criteria) this;
        }

        public Criteria andXfbdbznxIn(List<String> values) {
            addCriterion("xfbdBZNX in", values, "xfbdbznx");
            return (Criteria) this;
        }

        public Criteria andXfbdbznxNotIn(List<String> values) {
            addCriterion("xfbdBZNX not in", values, "xfbdbznx");
            return (Criteria) this;
        }

        public Criteria andXfbdbznxBetween(String value1, String value2) {
            addCriterion("xfbdBZNX between", value1, value2, "xfbdbznx");
            return (Criteria) this;
        }

        public Criteria andXfbdbznxNotBetween(String value1, String value2) {
            addCriterion("xfbdBZNX not between", value1, value2, "xfbdbznx");
            return (Criteria) this;
        }

        public Criteria andXfbdaflbIsNull() {
            addCriterion("xfbdAFLB is null");
            return (Criteria) this;
        }

        public Criteria andXfbdaflbIsNotNull() {
            addCriterion("xfbdAFLB is not null");
            return (Criteria) this;
        }

        public Criteria andXfbdaflbEqualTo(String value) {
            addCriterion("xfbdAFLB =", value, "xfbdaflb");
            return (Criteria) this;
        }

        public Criteria andXfbdaflbNotEqualTo(String value) {
            addCriterion("xfbdAFLB <>", value, "xfbdaflb");
            return (Criteria) this;
        }

        public Criteria andXfbdaflbGreaterThan(String value) {
            addCriterion("xfbdAFLB >", value, "xfbdaflb");
            return (Criteria) this;
        }

        public Criteria andXfbdaflbGreaterThanOrEqualTo(String value) {
            addCriterion("xfbdAFLB >=", value, "xfbdaflb");
            return (Criteria) this;
        }

        public Criteria andXfbdaflbLessThan(String value) {
            addCriterion("xfbdAFLB <", value, "xfbdaflb");
            return (Criteria) this;
        }

        public Criteria andXfbdaflbLessThanOrEqualTo(String value) {
            addCriterion("xfbdAFLB <=", value, "xfbdaflb");
            return (Criteria) this;
        }

        public Criteria andXfbdaflbLike(String value) {
            addCriterion("xfbdAFLB like", value, "xfbdaflb");
            return (Criteria) this;
        }

        public Criteria andXfbdaflbNotLike(String value) {
            addCriterion("xfbdAFLB not like", value, "xfbdaflb");
            return (Criteria) this;
        }

        public Criteria andXfbdaflbIn(List<String> values) {
            addCriterion("xfbdAFLB in", values, "xfbdaflb");
            return (Criteria) this;
        }

        public Criteria andXfbdaflbNotIn(List<String> values) {
            addCriterion("xfbdAFLB not in", values, "xfbdaflb");
            return (Criteria) this;
        }

        public Criteria andXfbdaflbBetween(String value1, String value2) {
            addCriterion("xfbdAFLB between", value1, value2, "xfbdaflb");
            return (Criteria) this;
        }

        public Criteria andXfbdaflbNotBetween(String value1, String value2) {
            addCriterion("xfbdAFLB not between", value1, value2, "xfbdaflb");
            return (Criteria) this;
        }

        public Criteria andZxrqIsNull() {
            addCriterion("ZXRQ is null");
            return (Criteria) this;
        }

        public Criteria andZxrqIsNotNull() {
            addCriterion("ZXRQ is not null");
            return (Criteria) this;
        }

        public Criteria andZxrqEqualTo(Date value) {
            addCriterion("ZXRQ =", value, "zxrq");
            return (Criteria) this;
        }

        public Criteria andZxrqNotEqualTo(Date value) {
            addCriterion("ZXRQ <>", value, "zxrq");
            return (Criteria) this;
        }

        public Criteria andZxrqGreaterThan(Date value) {
            addCriterion("ZXRQ >", value, "zxrq");
            return (Criteria) this;
        }

        public Criteria andZxrqGreaterThanOrEqualTo(Date value) {
            addCriterion("ZXRQ >=", value, "zxrq");
            return (Criteria) this;
        }

        public Criteria andZxrqLessThan(Date value) {
            addCriterion("ZXRQ <", value, "zxrq");
            return (Criteria) this;
        }

        public Criteria andZxrqLessThanOrEqualTo(Date value) {
            addCriterion("ZXRQ <=", value, "zxrq");
            return (Criteria) this;
        }

        public Criteria andZxrqIn(List<Date> values) {
            addCriterion("ZXRQ in", values, "zxrq");
            return (Criteria) this;
        }

        public Criteria andZxrqNotIn(List<Date> values) {
            addCriterion("ZXRQ not in", values, "zxrq");
            return (Criteria) this;
        }

        public Criteria andZxrqBetween(Date value1, Date value2) {
            addCriterion("ZXRQ between", value1, value2, "zxrq");
            return (Criteria) this;
        }

        public Criteria andZxrqNotBetween(Date value1, Date value2) {
            addCriterion("ZXRQ not between", value1, value2, "zxrq");
            return (Criteria) this;
        }

        public Criteria andZclbIsNull() {
            addCriterion("ZCLB is null");
            return (Criteria) this;
        }

        public Criteria andZclbIsNotNull() {
            addCriterion("ZCLB is not null");
            return (Criteria) this;
        }

        public Criteria andZclbEqualTo(String value) {
            addCriterion("ZCLB =", value, "zclb");
            return (Criteria) this;
        }

        public Criteria andZclbNotEqualTo(String value) {
            addCriterion("ZCLB <>", value, "zclb");
            return (Criteria) this;
        }

        public Criteria andZclbGreaterThan(String value) {
            addCriterion("ZCLB >", value, "zclb");
            return (Criteria) this;
        }

        public Criteria andZclbGreaterThanOrEqualTo(String value) {
            addCriterion("ZCLB >=", value, "zclb");
            return (Criteria) this;
        }

        public Criteria andZclbLessThan(String value) {
            addCriterion("ZCLB <", value, "zclb");
            return (Criteria) this;
        }

        public Criteria andZclbLessThanOrEqualTo(String value) {
            addCriterion("ZCLB <=", value, "zclb");
            return (Criteria) this;
        }

        public Criteria andZclbLike(String value) {
            addCriterion("ZCLB like", value, "zclb");
            return (Criteria) this;
        }

        public Criteria andZclbNotLike(String value) {
            addCriterion("ZCLB not like", value, "zclb");
            return (Criteria) this;
        }

        public Criteria andZclbIn(List<String> values) {
            addCriterion("ZCLB in", values, "zclb");
            return (Criteria) this;
        }

        public Criteria andZclbNotIn(List<String> values) {
            addCriterion("ZCLB not in", values, "zclb");
            return (Criteria) this;
        }

        public Criteria andZclbBetween(String value1, String value2) {
            addCriterion("ZCLB between", value1, value2, "zclb");
            return (Criteria) this;
        }

        public Criteria andZclbNotBetween(String value1, String value2) {
            addCriterion("ZCLB not between", value1, value2, "zclb");
            return (Criteria) this;
        }

        public Criteria andGwlbIsNull() {
            addCriterion("GWLB is null");
            return (Criteria) this;
        }

        public Criteria andGwlbIsNotNull() {
            addCriterion("GWLB is not null");
            return (Criteria) this;
        }

        public Criteria andGwlbEqualTo(String value) {
            addCriterion("GWLB =", value, "gwlb");
            return (Criteria) this;
        }

        public Criteria andGwlbNotEqualTo(String value) {
            addCriterion("GWLB <>", value, "gwlb");
            return (Criteria) this;
        }

        public Criteria andGwlbGreaterThan(String value) {
            addCriterion("GWLB >", value, "gwlb");
            return (Criteria) this;
        }

        public Criteria andGwlbGreaterThanOrEqualTo(String value) {
            addCriterion("GWLB >=", value, "gwlb");
            return (Criteria) this;
        }

        public Criteria andGwlbLessThan(String value) {
            addCriterion("GWLB <", value, "gwlb");
            return (Criteria) this;
        }

        public Criteria andGwlbLessThanOrEqualTo(String value) {
            addCriterion("GWLB <=", value, "gwlb");
            return (Criteria) this;
        }

        public Criteria andGwlbLike(String value) {
            addCriterion("GWLB like", value, "gwlb");
            return (Criteria) this;
        }

        public Criteria andGwlbNotLike(String value) {
            addCriterion("GWLB not like", value, "gwlb");
            return (Criteria) this;
        }

        public Criteria andGwlbIn(List<String> values) {
            addCriterion("GWLB in", values, "gwlb");
            return (Criteria) this;
        }

        public Criteria andGwlbNotIn(List<String> values) {
            addCriterion("GWLB not in", values, "gwlb");
            return (Criteria) this;
        }

        public Criteria andGwlbBetween(String value1, String value2) {
            addCriterion("GWLB between", value1, value2, "gwlb");
            return (Criteria) this;
        }

        public Criteria andGwlbNotBetween(String value1, String value2) {
            addCriterion("GWLB not between", value1, value2, "gwlb");
            return (Criteria) this;
        }

        public Criteria andGwgzIsNull() {
            addCriterion("GWGZ is null");
            return (Criteria) this;
        }

        public Criteria andGwgzIsNotNull() {
            addCriterion("GWGZ is not null");
            return (Criteria) this;
        }

        public Criteria andGwgzEqualTo(String value) {
            addCriterion("GWGZ =", value, "gwgz");
            return (Criteria) this;
        }

        public Criteria andGwgzNotEqualTo(String value) {
            addCriterion("GWGZ <>", value, "gwgz");
            return (Criteria) this;
        }

        public Criteria andGwgzGreaterThan(String value) {
            addCriterion("GWGZ >", value, "gwgz");
            return (Criteria) this;
        }

        public Criteria andGwgzGreaterThanOrEqualTo(String value) {
            addCriterion("GWGZ >=", value, "gwgz");
            return (Criteria) this;
        }

        public Criteria andGwgzLessThan(String value) {
            addCriterion("GWGZ <", value, "gwgz");
            return (Criteria) this;
        }

        public Criteria andGwgzLessThanOrEqualTo(String value) {
            addCriterion("GWGZ <=", value, "gwgz");
            return (Criteria) this;
        }

        public Criteria andGwgzLike(String value) {
            addCriterion("GWGZ like", value, "gwgz");
            return (Criteria) this;
        }

        public Criteria andGwgzNotLike(String value) {
            addCriterion("GWGZ not like", value, "gwgz");
            return (Criteria) this;
        }

        public Criteria andGwgzIn(List<String> values) {
            addCriterion("GWGZ in", values, "gwgz");
            return (Criteria) this;
        }

        public Criteria andGwgzNotIn(List<String> values) {
            addCriterion("GWGZ not in", values, "gwgz");
            return (Criteria) this;
        }

        public Criteria andGwgzBetween(String value1, String value2) {
            addCriterion("GWGZ between", value1, value2, "gwgz");
            return (Criteria) this;
        }

        public Criteria andGwgzNotBetween(String value1, String value2) {
            addCriterion("GWGZ not between", value1, value2, "gwgz");
            return (Criteria) this;
        }
    }

public static class Criteria extends GeneratedCriteria implements Serializable {

	private static final long serialVersionUID = 4139618954969695524L;


        protected Criteria() {
            super();
        }
    }

public static class Criterion implements Serializable {

	private static final long serialVersionUID = 35747729818530821L;

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
