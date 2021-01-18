package com.company.creational.builder;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class BuildWebsiteRunnerTest {
    private Director director;

    @BeforeEach
    void initAll() {
        director = new Director();
    }

    @Test
    public void testPatternBuilder() {
        Director director = new Director();

        director.setBuilder(new EnterpriseWebsiteBuilder());
        Website enterprise = director.buildWebsite();

        assertNotEquals(null, enterprise);
        assertEquals(enterprise.getClass(), Website.class);

        director.setBuilder(new VisitCardWebsite());
        Website visitCard = director.buildWebsite();

        assertNotEquals(null, visitCard);
        assertEquals(visitCard.getClass(), Website.class);

    }

    @Test
    public void testCorrectCreationVisitCardWebsite() {
        director.setBuilder(new VisitCardWebsite());
        Website visitCard = director.buildWebsite();

        assertEquals(visitCard.getName(), "Visit card");
        assertEquals(visitCard.getCms(), Cms.WORDPRESS);
        assertEquals(visitCard.getPrice(), 500);
    }

    @Test
    public void testCorrectCreationEnterpriseWebsiteBuilder() {
        director.setBuilder(new EnterpriseWebsiteBuilder());
        Website enterprise = director.buildWebsite();

        assertEquals(enterprise.getName(), "Enterprise website");
        assertEquals(enterprise.getCms(), Cms.ALIFRESCO);
        assertEquals(enterprise.getPrice(), 10000);
    }
}