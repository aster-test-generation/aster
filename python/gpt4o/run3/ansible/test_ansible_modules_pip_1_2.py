import unittest
from ansible.modules.pip import _is_vcs_url, _VCS_RE, op_dict


class TestPipModule(unittest.TestCase):
    def test_is_vcs_url_with_vcs_url(self):
        result = _is_vcs_url('git+https://example.com/repo.git')
        self.assertTrue(result)

    def test_is_vcs_url_with_non_vcs_url(self):
        result = _is_vcs_url('https://example.com/repo.git')
        self.assertFalse(result)

    def test_vcs_re_pattern_match(self):
        match = _VCS_RE.match('git+https://example.com/repo.git')
        self.assertIsNotNone(match)

    def test_vcs_re_pattern_no_match(self):
        match = _VCS_RE.match('https://example.com/repo.git')
        self.assertIsNone(match)

    def test_operator_dict_greater_than(self):
        result = op_dict['>'](5, 3)
        self.assertTrue(result)

    def test_operator_dict_less_than(self):
        result = op_dict['<'](3, 5)
        self.assertTrue(result)

    def test_operator_dict_equal(self):
        result = op_dict['=='](5, 5)
        self.assertTrue(result)

    def test_operator_dict_not_equal(self):
        result = op_dict['!='](5, 3)
        self.assertTrue(result)

    def test_operator_dict_greater_equal(self):
        result = op_dict['>='](5, 5)
        self.assertTrue(result)

    def test_operator_dict_less_equal(self):
        result = op_dict['<='](3, 5)
        self.assertTrue(result)

    def test_operator_dict_approx_equal(self):
        result = op_dict['~='](5, 5)
        self.assertTrue(result)

if __name__ == '__main__':
    unittest.main()