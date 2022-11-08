# JavaBasicTests
This repo contains basic java testing without any framework

### Why You Should Care About Testing


Anytime you write application code that is deployed and used, it is being tested. Whether you write tests in code, manually test it via a browser or device, or publish it and let your users test it, is merely a detail. I do not recommend that last option!

Most start by manual testing which means to deploy and use the application like a typical user would. While there is a time for that, checking critical application logic can be done in a systematic, faster, and more reliable way by writing code tests.

What seems like extra work initially, will save you time for two reasons: Firstly, you will catch and identify your errors sooner. Secondly you can run your tests with lightning speed on your local JVM environment.

Building and deploying your application to a server or a device for manual testing can be orders of magnitude slower by comparison.

#### How To Write Testable Code


Testing your code means verifying that it works as intended. However, getting from there to writing code tests might be challenging. To make matters worse, many tutorials go into great detail about a particular tool without describing the basic testing process.

To avoid any confusion, the first example will demonstrate how to test some code without using any libraries at all; not even JUnit. With that being said, I do encourage you to find a setup that works for you.

***NOTE*****:** *Some of you may have heard of test driven development (TDD). I will not be applying TDD in these examples, but I will address it and the topic of 100% code coverage, toward the end of this article.*
