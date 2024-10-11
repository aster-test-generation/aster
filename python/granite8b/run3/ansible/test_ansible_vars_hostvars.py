from ansible.vars.hostvars import HostVars
import unittest


class TestHostVars(unittest.TestCase):
    def test_raw_get(self):
        hostvars = HostVars(None, None, None)
        self.assertIsInstance(hostvars.raw_get('host'), dict)

    def test_getitem(self):
        hostvars = HostVars(None, None, None)
        self.assertIsInstance(hostvars['host'], HostVarsVars)

    def test_set_host_variable(self):
        hostvars = HostVars(None, None, None)
        hostvars.set_host_variable('host', 'var', 'value')

    def test_set_nonpersistent_facts(self):
        hostvars = HostVars(None, None, None)
        hostvars.set_nonpersistent_facts('host', {'fact': 'value'})

    def test_set_host_facts(self):
        hostvars = HostVars(None, None, None)
        hostvars.set_host_facts('host', {'fact': 'value'})

    def test_contains(self):
        hostvars = HostVars(None, None, None)
        self.assertTrue('host' in hostvars)

    def test_iter(self):
        hostvars = HostVars(None, None, None)
        self.assertIn('host', hostvars)

    def test_len(self):
        hostvars = HostVars(None, None, None)
        self.assertEqual(len(hostvars), 1)

    def test_repr(self):
        hostvars = HostVars(None, None, None)
        self.assertEqual(repr(hostvars), "{'host': HostVarsVars({'host': {}}, loader=None)}")

if __name__ == '__main__':
    unittest.main()