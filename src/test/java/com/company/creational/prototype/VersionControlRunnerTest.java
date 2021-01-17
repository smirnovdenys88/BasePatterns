package com.company.creational.prototype;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class VersionControlRunnerTest {

    private Project project;

    @BeforeEach
    void initAll() {
        project = new Project(1L, "Test project", "Test source code");
    }

    @Test
    public void testPatternPrototype() {
        ProjectFactory factory = new ProjectFactory(project);
        Project cloneProject = factory.cloneProject();

        assertEquals(project.getId(), cloneProject.getId());
        assertEquals(project.getProjectName(), cloneProject.getProjectName());
        assertEquals(project.getSourceCode(), cloneProject.getSourceCode());

        assertNotEquals(project, cloneProject);
    }
}