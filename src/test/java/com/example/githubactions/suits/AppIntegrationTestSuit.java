package com.example.githubactions.suits;

import org.junit.platform.suite.api.IncludeTags;
import org.junit.platform.suite.api.SelectPackages;

@SelectPackages("com.example.githubactions")
@IncludeTags("IntegrationTest")
public class AppIntegrationTestSuit {
}
