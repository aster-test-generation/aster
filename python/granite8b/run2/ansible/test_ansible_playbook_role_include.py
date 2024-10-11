import unittest
from ansible.module_utils.common.collections import ImmutableDict


class TestRoleInclude(unittest.TestCase):
    def test_init(self):
        ri = RoleInclude()
        self.assertIsInstance(ri, RoleInclude)

    def test_load(self):
        ri = RoleInclude()
        data = {'name': 'test_role'}
        result = ri.load(data)
        self.assertEqual(result.name, 'test_role')

    def test_delegate_to(self):
        ri = RoleInclude()
        ri._delegate_to = 'localhost'
        self.assertEqual(ri._delegate_to, 'localhost')

    def test_delegate_facts(self):
        ri = RoleInclude()
        ri._delegate_facts = True
        self.assertEqual(ri._delegate_facts, True)

if __name__ == '__main__':
    unittest.main()