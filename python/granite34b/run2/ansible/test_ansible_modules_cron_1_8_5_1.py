import unittest
from unittest.mock import MagicMock
from ansible.modules.cron import CronTab


class TestCronTab(unittest.TestCase):
    def setUp(self):
        self.module = MagicMock()
        self.cron = CronTab(self.module)

    def test_add_env(self):
        decl = "TEST=test"
        self.cron.add_env(decl)
        self.assertEqual(self.cron.lines[0], decl)

    def test_add_env_with_insertafter(self):
        decl = "TEST=test"
        other_name = "OTHER=other"
        self.cron.lines = [other_name]
        self.cron.add_env(decl, insertafter=other_name)
        self.assertEqual(self.cron.lines[1], decl)

    def test_add_env_with_insertbefore(self):
        decl = "TEST=test"
        other_name = "OTHER=other"
        self.cron.lines = [other_name]
        self.cron.add_env(decl, insertbefore=other_name)
        self.assertEqual(self.cron.lines[0], decl)

    def test_add_env_with_insertafter_not_found(self):
        decl = "TEST=test"
        other_name = "OTHER=other"
        self.cron.lines = [other_name]
        with self.assertRaises(Exception) as context:
            self.cron.add_env(decl, insertafter="NOTFOUND")
        self.assertTrue("Variable named 'NOTFOUND' not found." in str(context.exception))

    def test_add_env_with_insertbefore_not_found(self):
        decl = "TEST=test"
        other_name = "OTHER=other"
        self.cron.lines = [other_name]
        with self.assertRaises(Exception) as context:
            self.cron.add_env(decl, insertbefore="NOTFOUND")
        self.assertTrue("Variable named 'NOTFOUND' not found." in str(context.exception))

if __name__ == '__main__':
    unittest.main()