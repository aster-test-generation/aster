import unittest
from ansible.plugins.action import set_fact


class TestActionModule(unittest.TestCase):
    def test_run(self):
        action = ActionModule(None, None, None)
        result = action.run(None, None)
        self.assertEqual(result, {})

    def test_isidentifier(self):
        action = ActionModule(None, None, None)
        self.assertTrue(action._isidentifier('abc'))
        self.assertTrue(action._isidentifier('_abc'))
        self.assertFalse(action._isidentifier('1abc'))
        self.assertFalse(action._isidentifier('abc '))

    def test_boolean(self):
        action = ActionModule(None, None, None)
        self.assertTrue(action._boolean('true'))
        self.assertTrue(action._boolean('yes'))
        self.assertTrue(action._boolean('on'))
        self.assertTrue(action._boolean('1'))
        self.assertFalse(action._boolean('false'))
        self.assertFalse(action._boolean('no'))
        self.assertFalse(action._boolean('off'))
        self.assertFalse(action._boolean('0'))

if __name__ == '__main__':
    unittest.main()