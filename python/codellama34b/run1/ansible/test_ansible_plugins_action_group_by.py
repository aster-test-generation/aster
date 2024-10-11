import unittest
from ansible.plugins.action.yaml import ActionModule



class TestActionModule(unittest.TestCase):
    def test_run(self):
        instance = ActionModule()
        result = instance.run()
        self.assertEqual(result, None)

    def test_run_with_args(self):
        instance = ActionModule()
        result = instance.run(None, dict())
        self.assertEqual(result['failed'], True)
        self.assertEqual(result['msg'], "the 'key' param is required when using group_by")

    def test_run_with_key(self):
        instance = ActionModule()
        result = instance.run(None, dict(key='key'))
        self.assertEqual(result['changed'], False)
        self.assertEqual(result['add_group'], 'key')
        self.assertEqual(result['parent_groups'], ['all'])

    def test_run_with_parents(self):
        instance = ActionModule()
        result = instance.run(None, dict(key='key', parents='parents'))
        self.assertEqual(result['changed'], False)
        self.assertEqual(result['add_group'], 'key')
        self.assertEqual(result['parent_groups'], ['parents'])

    def test_run_with_parents_list(self):
        instance = ActionModule()
        result = instance.run(None, dict(key='key', parents=['parents1', 'parents2']))
        self.assertEqual(result['changed'], False)
        self.assertEqual(result['add_group'], 'key')
        self.assertEqual(result['parent_groups'], ['parents1', 'parents2'])

    def test_run_with_parents_list_string(self):
        instance = ActionModule()
        result = instance.run(None, dict(key='key', parents=['parents1', 'parents2']))
        self.assertEqual(result['changed'], False)
        self.assertEqual(result['add_group'], 'key')
        self.assertEqual(result['parent_groups'], ['parents1', 'parents2'])

    def test_run_with_parents_list_string_space(self):
        instance = ActionModule()
        result = instance.run(None, dict(key='key', parents=['parents 1', 'parents 2']))
        self.assertEqual(result['changed'], False)
        self.assertEqual(result['add_group'], 'key')
        self.assertEqual(result['parent_groups'], ['parents-1', 'parents-2'])

    def test_run_with_parents_list_string_space_hyphen(self):
        instance = ActionModule()
        result = instance.run(None, dict(key='key', parents=['parents 1', 'parents-2']))
        self.assertEqual(result['changed'], False)
        self.assertEqual(result['add_group'], 'key')
        self.assertEqual(result['parent_groups'], ['parents-1', 'parents-2'])

    def test_run_with_parents_list_string_hyphen(self):
        instance = ActionModule()
        result = instance.run(None, dict(key='key', parents=['parents-1', 'parents-2']))
        self.assertEqual(result['changed'], False)
        self.assertEqual(result['add_group'], 'key')
        self.assertEqual(result['parent_groups'], ['parents-1', 'parents-2'])

    def test_run_with_parents_list_string_hyphen_space(self):
        instance = ActionModule()
        result = instance.run(None, dict(key='key', parents=['parents- 1', 'parents- 2']))
        self.assertEqual(result['changed'], False)
        self.assertEqual(result['add_group'], 'key')
        self.assertEqual(result['parent_groups'], ['parents-1', 'parents-2'])

if __name__ == '__main__':
    unittest.main()