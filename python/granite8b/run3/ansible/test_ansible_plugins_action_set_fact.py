import unittest
from ansible.plugins.action import set_fact


class TestActionModule(unittest.TestCase):
    def test_run(self):
        instance = ActionModule()
        result = instance.run()
        self.assertEqual(result, {})

    def test_isidentifier(self):
        instance = ActionModule()
        result = instance._isidentifier('test')
        self.assertTrue(result)

    def test_boolean(self):
        instance = ActionModule()
        result = instance._boolean('true')
        self.assertTrue(result)

    def test_facts(self):
        instance = ActionModule()
        result = instance._facts()
        self.assertEqual(result, {})

if __name__ == '__main__':
    unittest.main()