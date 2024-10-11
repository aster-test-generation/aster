import unittest
from ansible.modules.pip import *



class TestPipModule(unittest.TestCase):
    def test_is_vcs_url(self):
        result = _is_vcs_url('svn+')
        self.assertEqual(result, True)

    def test_is_vcs_url(self):
        result = _is_vcs_url('git+')
        self.assertEqual(result, True)

    def test_is_vcs_url(self):
        result = _is_vcs_url('hg+')
        self.assertEqual(result, True)

    def test_is_vcs_url(self):
        result = _is_vcs_url('bzr+')
        self.assertEqual(result, True)

    def test_is_vcs_url(self):
        result = _is_vcs_url('svn')
        self.assertEqual(result, False)

    def test_is_vcs_url(self):
        result = _is_vcs_url('git')
        self.assertEqual(result, False)

    def test_is_vcs_url(self):
        result = _is_vcs_url('hg')
        self.assertEqual(result, False)

    def test_is_vcs_url(self):
        result = _is_vcs_url('bzr')
        self.assertEqual(result, False)

    def test_is_vcs_url(self):
        result = _is_vcs_url('')
        self.assertEqual(result, False)

    def test_is_vcs_url(self):
        result = _is_vcs_url(None)
        self.assertEqual(result, False)

    def test_is_vcs_url(self):
        result = _is_vcs_url(1)
        self.assertEqual(result, False)

    def test_is_vcs_url(self):
        result = _is_vcs_url(1.0)
        self.assertEqual(result, False)

    def test_is_vcs_url(self):
        result = _is_vcs_url(True)
        self.assertEqual(result, False)

    def test_is_vcs_url(self):
        result = _is_vcs_url(False)
        self.assertEqual(result, False)

    def test_is_vcs_url(self):
        result = _is_vcs_url([])
        self.assertEqual(result, False)

    def test_is_vcs_url(self):
        result = _is_vcs_url({})
        self.assertEqual(result, False)

    def test_is_vcs_url(self):
        result = _is_vcs_url(object)
        self.assertEqual(result, False)

    def test_is_vcs_url(self):
        result = _is_vcs_url(unittest)
        self.assertEqual(result, False)

    def test_is_vcs_url(self):
        result = _is_vcs_url(TestPipModule)
        self.assertEqual(result, False)

    def test_is_vcs_url(self):
        result = _is_vcs_url(TestPipModule())
        self.assertEqual(result, False)

    def test_is_vcs_url(self):
        result = _is_vcs_url(is_vcs_url)
        self.assertEqual(result, False)

    def test_is_vcs_url(self):
        result = _is_vcs_url(is_vcs_url())
        self.assertEqual(result, False)

    def test_is_vcs_url(self):
        result = is_vcs_url(None)
        self.assertEqual(result, False)

if __name__ == '__main__':
    unittest.main()