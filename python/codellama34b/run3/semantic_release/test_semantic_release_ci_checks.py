import unittest
from semantic_release.ci_checks import *


class TestCiChecks(unittest.TestCase):
    def test_checker(self):
        result = checker(travis)
        self.assertEqual(result, False)

    def test_travis(self):
        result = travis("master")
        self.assertEqual(result, True)

    def test_semaphore(self):
        result = semaphore("master")
        self.assertEqual(result, True)

    def test_frigg(self):
        result = frigg("master")
        self.assertEqual(result, True)

    def test_circle(self):
        result = circle("master")
        self.assertEqual(result, True)

    def test_gitlab(self):
        result = gitlab("main")
        self.assertEqual(result, True)

    def test_bitbucket(self):
        result = bitbucket("main")
        self.assertEqual(result, True)

    def test_jenkins(self):
        result = jenkins("master")
        self.assertEqual(result, True)

    def test_check(self):
        result = check("master")
        self.assertEqual(result, None)

if __name__ == '__main__':
    unittest.main()