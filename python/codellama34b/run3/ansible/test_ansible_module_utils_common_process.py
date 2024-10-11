import unittest
from ansible.module_utils.common.process import *
from ansible.module_utils.common.process import get_bin_path



class TestGetBinPath(unittest.TestCase):
    def test_get_bin_path(self):
        result = get_bin_path('arg', ['/sbin', '/usr/sbin', '/usr/local/sbin', '/home/myeongsoo/.cache/pypoetry/virtualenvs/aster-lejQGH7U-py3.11/bin', '/home/myeongsoo/.pyenv/plugins/pyenv-virtualenv/shims', '/home/myeongsoo/.pyenv/shims', '/home/myeongsoo/.pyenv/bin', '/home/myeongsoo/.local/bin', '/home/myeongsoo/.pyenv/plugins/pyenv-virtualenv/shims', '/home/myeongsoo/.pyenv/bin', '/home/myeongsoo/.local/bin', '/home/myeongsoo/.local/bin', '/home/myeongsoo/bin', '/home/myeongsoo/.pyenv/plugins/pyenv-virtualenv/shims', '/home/myeongsoo/.pyenv/bin', '/home/myeongsoo/.local/bin', '/usr/local/bin', '/usr/bin', '/usr/local/sbin', '/usr/sbin'], True)
        self.assertEqual(result, '/sbin/arg')

    def test_get_bin_path_2(self):
        result = get_bin_path('arg', ['/sbin', '/usr/sbin', '/usr/local/sbin', '/home/myeongsoo/.cache/pypoetry/virtualenvs/aster-lejQGH7U-py3.11/bin', '/home/myeongsoo/.pyenv/plugins/pyenv-virtualenv/shims', '/home/myeongsoo/.pyenv/shims', '/home/myeongsoo/.pyenv/bin', '/home/myeongsoo/.local/bin', '/home/myeongsoo/.pyenv/plugins/pyenv-virtualenv/shims', '/home/myeongsoo/.pyenv/bin', '/home/myeongsoo/.local/bin', '/home/myeongsoo/.local/bin', '/home/myeongsoo/bin', '/home/myeongsoo/.pyenv/plugins/pyenv-virtualenv/shims', '/home/myeongsoo/.pyenv/bin', '/home/myeongsoo/.local/bin', '/usr/local/bin', '/usr/bin', '/usr/local/sbin', '/usr/sbin'], False)
        self.assertEqual(result, '/sbin/arg')

    def test_get_bin_path_3(self):
        result = get_bin_path('arg', ['/sbin', '/usr/sbin', '/usr/local/sbin', '/test-apps/ansible/lib/venv/bin'], None)
        self.assertEqual(result, '/sbin/arg')

    def test_get_bin_path_4(self):
        result = get_bin_path('arg', ['/sbin', '/usr/sbin', '/usr/local/sbin'], 'True')
        self.assertEqual(result, '/sbin/arg')

    def test_get_bin_path_5(self):
        result = get_bin_path('arg', ['/sbin', '/usr/sbin', '/usr/local/sbin'], 'False')
        self.assertEqual(result, '/sbin/arg')

    def test_get_bin_path_6(self):
        result = get_bin_path('arg', ['/sbin', '/usr/sbin', '/usr/local/sbin'], 'test-apps/ansible/lib/venv/bin')
        self.assertEqual(result, '/sbin/arg')

    def test_get_bin_path_7(self):
        result = get_bin_path('arg', ['/sbin', '/usr/sbin', '/usr/local/sbin', '/home/myeongsoo/.cache/pypoetry/virtualenvs/aster-lejQGH7U-py3.11/bin', '/home/myeongsoo/.pyenv/plugins/pyenv-virtualenv/shims', '/home/myeongsoo/.pyenv/shims', '/home/myeongsoo/.pyenv/bin', '/home/myeongsoo/.local/bin', '/home/myeongsoo/.pyenv/plugins/pyenv-virtualenv/shims', '/home/myeongsoo/.pyenv/bin', '/home/myeongsoo/.local/bin', '/home/myeongsoo/.local/bin', '/home/myeongsoo/bin', '/home/myeongsoo/.pyenv/plugins/pyenv-virtualenv/shims', '/home/myeongsoo/.pyenv/bin', '/home/myeongsoo/.local/bin', '/usr/local/bin', '/usr/bin', '/usr/local/sbin', '/usr/sbin'], 1)
        self.assertEqual(result, '/sbin/arg')

    def test_get_bin_path_8(self):
        result = get_bin_path('arg', ['/sbin', '/usr/sbin', '/usr/local/sbin', '/home/myeongsoo/.cache/pypoetry/virtualenvs/aster-lejQGH7U-py3.11/bin', '/home/myeongsoo/.pyenv/plugins/pyenv-virtualenv/shims', '/home/myeongsoo/.pyenv/shims', '/home/myeongsoo/.pyenv/bin', '/home/myeongsoo/.local/bin', '/home/myeongsoo/.pyenv/plugins/pyenv-virtualenv/shims', '/home/myeongsoo/.pyenv/bin', '/home/myeongsoo/.local/bin', '/home/myeongsoo/.local/bin', '/home/myeongsoo/bin', '/home/myeongsoo/.pyenv/plugins/pyenv-virtualenv/shims', '/home/myeongsoo/.pyenv/bin', '/home/myeongsoo/.local/bin', '/usr/local/bin', '/usr/bin', '/usr/local/sbin', '/usr/sbin'], 0)
        self.assertEqual(result, '/sbin/arg')

    def test_get_bin_path_9(self):
        result = get_bin_path('arg', ['/sbin', '/usr/sbin', '/usr/local/sbin', '/test-apps/ansible/lib/venv/bin', '/home/myeongsoo/.cache/pypoetry/virtualenvs/aster-lejQGH7U-py3.11/bin', '/home/myeongsoo/.pyenv/plugins/pyenv-virtualenv/shims', '/home/myeongsoo/.pyenv/shims', '/home/myeongsoo/.pyenv/bin', '/home/myeongsoo/.local/bin', '/home/myeongsoo/.pyenv/plugins/pyenv-virtualenv/shims', '/home/myeongsoo/.pyenv/bin', '/home/myeongsoo/.local/bin', '/home/myeongsoo/.local/bin', '/home/myeongsoo/bin', '/home/myeongsoo/.pyenv/plugins/pyenv-virtualenv/shims', '/home/myeongsoo/.pyenv/bin', '/home/myeongsoo/.local/bin', '/usr/local/bin', '/usr/bin', '/usr/local/sbin', '/usr/sbin'], '1')
        self.assertEqual(result, '/sbin/arg')

    def test_get_bin_path_10(self):
        result = get_bin_path('arg', ['/sbin', '/usr/sbin', '/usr/local/sbin', '/test-apps/ansible/lib/venv/bin', '/home/myeongsoo/.cache/pypoetry/virtualenvs/aster-lejQGH7U-py3.11/bin', '/home/myeongsoo/.pyenv/plugins/pyenv-virtualenv/shims', '/home/myeongsoo/.pyenv/shims', '/home/myeongsoo/.pyenv/bin', '/home/myeongsoo/.local/bin', '/home/myeongsoo/.pyenv/plugins/pyenv-virtualenv/shims', '/home/myeongsoo/.pyenv/bin', '/home/myeongsoo/.local/bin', '/home/myeongsoo/.local/bin', '/home/myeongsoo/bin', '/home/myeongsoo/.pyenv/plugins/pyenv-virtualenv/shims', '/home/myeongsoo/.pyenv/bin', '/home/myeongsoo/.local/bin', '/usr/local/bin', '/usr/bin', '/usr/local/sbin', '/usr/sbin'], '0')
        self.assertEqual(result, '/sbin/arg')

    def test_get_bin_path_11(self):
        result = get_bin_path('arg', ['/sbin', '/usr/sbin', '/usr/local/sbin'], 'True')
        self.assertEqual(result, '/sbin/arg')

    def test_get_bin_path_12(self):
        result = get_bin_path('arg', ['/sbin', '/usr/sbin', '/usr/local/sbin'], 'True')
        self.assertEqual(result, '/sbin/arg')

    def test_get_bin_path_13(self):
        result = get_bin_path('arg', ['/sbin', '/usr/sbin', '/usr/local/sbin'], 'None')
        self.assertEqual(result, '/sbin/arg')

    def test_get_bin_path_14(self):
        result = get_bin_path('arg', ['/sbin', '/usr/sbin', '/usr/local/sbin', '/test-apps/ansible/lib/venv/bin', '/home/myeongsoo/.cache/pypoetry/virtualenvs/aster-lejQGH7U-py3.11/bin', '/home/myeongsoo/.pyenv/plugins/pyenv-virtualenv/shims', '/home/myeongsoo/.pyenv/shims', '/home/myeongsoo/.pyenv/bin', '/home/myeongsoo/.local/bin', '/home/myeongsoo/.pyenv/plugins/pyenv-virtualenv/shims', '/home/myeongsoo/.pyenv/bin', '/home/myeongsoo/.local/bin', '/home/myeongsoo/.local/bin', '/home/myeongsoo/bin', '/home/myeongsoo/.pyenv/plugins/pyenv-virtualenv/shims', '/home/myeongsoo/.pyenv/bin', '/home/myeongsoo/.local/bin', '/usr/local/bin', '/usr/bin', '/usr/local/sbin', '/usr/sbin'], 1)
        self.assertEqual(result, '/sbin/arg')

    def test_get_bin_path_15(self):
        result = get_bin_path('arg', ['/sbin', '/usr/sbin', '/usr/local/sbin', '/home/myeongsoo/.cache/pypoetry/virtualenvs/aster-lejQGH7U-py3.11/bin', '/home/myeongsoo/.pyenv/plugins/pyenv-virtualenv/shims', '/home/myeongsoo/.pyenv/shims', '/home/myeongsoo/.pyenv/bin', '/home/myeongsoo/.local/bin', '/home/myeongsoo/.pyenv/plugins/pyenv-virtualenv/shims', '/home/myeongsoo/.pyenv/bin', '/home/myeongsoo/.local/bin', '/home/myeongsoo/.local/bin', '/home/myeongsoo/bin', '/home/myeongsoo/.pyenv/plugins/pyenv-virtualenv/shims', '/home/myeongsoo/.pyenv/bin', '/home/myeongsoo/.local/bin', '/usr/local/bin', '/usr/bin', '/usr/local/sbin', '/usr/sbin'], 0)
        self.assertEqual(result, '/sbin/arg')


class TestGetBinPath(unittest.TestCase):
    def test_get_bin_path(self):
        result = get_bin_path("arg")
        self.assertEqual(result, "arg")

    def test_get_bin_path_with_opt_dirs(self):
        result = get_bin_path("arg", opt_dirs=["/sbin", "/usr/sbin", "/usr/local/sbin"])
        self.assertEqual(result, "arg")

    def test_get_bin_path_with_required(self):
        result = get_bin_path("arg", required=True)
        self.assertEqual(result, "arg")

    def test_get_bin_path_with_opt_dirs_and_required(self):
        result = get_bin_path("arg", opt_dirs=["/sbin", "/usr/sbin", "/usr/local/sbin"], required=True)
        self.assertEqual(result, "arg")

if __name__ == '__main__':
    unittest.main()