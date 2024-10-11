import unittest
from ansible.plugins.action.yaml import *



class TestActionModule(unittest.TestCase):
    def test_get_args_from_task_vars(self):
        instance = ActionModule()
        result = instance.get_args_from_task_vars({}, {})
        self.assertEqual(result, {})

    def test_run(self):
        instance = ActionModule()
        result = instance.run(None, {})
        self.assertEqual(result['validate_args_context'], {})


if __name__ == '__main__':
    unittest.main()