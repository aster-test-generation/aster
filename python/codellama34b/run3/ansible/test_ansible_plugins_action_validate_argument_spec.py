import unittest
from ansible.plugins.action.yaml import *


class TestActionModule(unittest.TestCase):
    def test_get_args_from_task_vars(self):
        instance = ActionModule()
        result = instance.get_args_from_task_vars(None, None)
        self.assertEqual(result, None)

    def test_run(self):
        instance = ActionModule()
        result = instance.run(None, None)
        self.assertEqual(result['validate_args_context'], None)


class TestArgumentSpecValidator(unittest.TestCase):
    def test_validate(self):
        instance = ArgumentSpecValidator(None)
        result = instance.validate(None)
        self.assertEqual(result.error_messages, None)


if __name__ == '__main__':
    unittest.main()