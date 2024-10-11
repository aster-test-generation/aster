import unittest
from ansible.modules.pip import _is_present, _VCS_RE, op_dict


class TestPipModule(unittest.TestCase):
    def setUp(self):
        self.module = None  # Mock or create an instance of AnsibleModule if needed
        self.pkg_command = 'pip'
        self.installed_pkgs = ['ansible==2.9.10', 'six==1.15.0']
        self.req = type('Requirement', (object,), {
            'package_name': 'ansible',
            'is_satisfied_by': lambda self, version: version == '2.9.10'
        })()

    def test_is_present_true(self):
        result = _is_present(self.module, self.req, self.installed_pkgs, self.pkg_command)
        self.assertTrue(result)

    def test_is_present_false(self):
        self.req.package_name = 'nonexistent'
        result = _is_present(self.module, self.req, self.installed_pkgs, self.pkg_command)
        self.assertFalse(result)

    def test_vcs_re(self):
        match = _VCS_RE.match('git+https://example.com/repo.git')
        self.assertIsNotNone(match)
        self.assertEqual(match.group(1), 'git')

    def test_op_dict(self):
        self.assertTrue(op_dict['>='](2, 1))
        self.assertTrue(op_dict['<='](1, 2))
        self.assertTrue(op_dict['>'](2, 1))
        self.assertTrue(op_dict['<'](1, 2))
        self.assertTrue(op_dict['=='](1, 1))
        self.assertTrue(op_dict['!='](1, 2))
        self.assertTrue(op_dict['~='](2, 1))

if __name__ == '__main__':
    unittest.main()