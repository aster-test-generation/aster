import unittest
from ansible.parsing.yaml.objects import *


class TestPlay(unittest.TestCase):
    def test_init(self):
        instance = Play()
        self.assertEqual(instance._included_conditional, None)
        self.assertEqual(instance._included_path, None)
        self.assertEqual(instance._action_groups, {})
        self.assertEqual(instance._group_actions, {})

    def test_compile(self):
        instance = Play()
        result = instance.compile()
        self.assertEqual(result, None)

    def test_get_vars(self):
        instance = Play()
        result = instance.get_vars()
        self.assertEqual(result, None)

    def test_get_vars_files(self):
        instance = Play()
        result = instance.get_vars_files()
        self.assertEqual(result, None)

    def test_get_handlers(self):
        instance = Play()
        result = instance.get_handlers()
        self.assertEqual(result, None)

    def test_get_roles(self):
        instance = Play()
        result = instance.get_roles()
        self.assertEqual(result, None)

    def test_get_tasks(self):
        instance = Play()
        result = instance.get_tasks()
        self.assertEqual(result, None)

    def test_serialize(self):
        instance = Play()
        result = instance.serialize()
        self.assertEqual(result, None)

    def test_deserialize(self):
        instance = Play()
        result = instance.deserialize(None)
        self.assertEqual(result, None)

    def test_copy(self):
        instance = Play()
        result = instance.copy()
        self.assertEqual(result, None)

if __name__ == '__main__':
    unittest.main()