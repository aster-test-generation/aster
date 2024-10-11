import unittest
from ansible.modules.expect import *


class TestExpect(unittest.TestCase):
    def test_expect(self):
        instance = Expect()
        result = instance.expect(None, None, None, None, None, None, None)
        self.assertEqual(result, None)

    def test_run_command(self):
        instance = Expect()
        result = instance._run_command(None, None, None, None, None, None, None)
        self.assertEqual(result, None)

    def test_check_command(self):
        instance = Expect()
        result = instance._check_command(None)
        self.assertEqual(result, None)

    def test_check_arguments(self):
        instance = Expect()
        result = instance._check_arguments(None, None, None, None, None, None, None)
        self.assertEqual(result, None)

    def test_check_timeout(self):
        instance = Expect()
        result = instance._check_timeout(None)
        self.assertEqual(result, None)

    def test_check_responses(self):
        instance = Expect()
        result = instance._check_responses(None)
        self.assertEqual(result, None)

    def test_check_echo(self):
        instance = Expect()
        result = instance._check_echo(None)
        self.assertEqual(result, None)

    def test_check_chdir(self):
        instance = Expect()
        result = instance._check_chdir(None)
        self.assertEqual(result, None)

    def test_check_creates(self):
        instance = Expect()
        result = instance._check_creates(None)
        self.assertEqual(result, None)

    def test_check_removes(self):
        instance = Expect()
        result = instance._check_removes(None)
        self.assertEqual(result, None)

    def test_main(self):
        instance = Expect()
        result = instance.main()
        self.assertEqual(result, None)

if __name__ == '__main__':
    unittest.main()