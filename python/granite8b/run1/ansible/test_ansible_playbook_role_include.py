import unittest
from ansible.module_utils.common.collections import ImmutableDict


class TestRoleInclude(unittest.TestCase):
    def test_load_data(self):
        ri = RoleInclude()
        data = {'name': 'foo', 'tasks': 'tasks.yml'}
        result = ri.load_data(data)
        self.assertEqual(result.name, 'foo')
        self.assertEqual(result.tasks, 'tasks.yml')

    def test_delegate_to(self):
        ri = RoleInclude()
        ri._delegate_to = 'localhost'
        self.assertEqual(ri.delegate_to, 'localhost')

    def test_delegate_facts(self):
        ri = RoleInclude()
        ri._delegate_facts = True
        self.assertEqual(ri.delegate_facts, True)

    def test_init(self):
        ri = RoleInclude()
        self.assertIsInstance(ri, RoleInclude)

if __name__ == '__main__':
    unittest.main()