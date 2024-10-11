import unittest
from ansible.modules.lineinfile import *


class TestLineInFile(unittest.TestCase):
    def test_absent_with_regexp(self):
        module = AnsibleModule()
        dest = '/path/to/file'
        regexp = '.*'
        line = 'new line'
        backup = True
        absent(module, dest, regexp, None, line, backup)

    def test_absent_with_search_string(self):
        module = AnsibleModule()
        dest = '/path/to/file'
        search_string = 'old line'
        line = 'new line'
        backup = True
        absent(module, dest, None, search_string, line, backup)

    def test_present_with_regexp(self):
        module = AnsibleModule()
        dest = '/path/to/file'
        regexp = '.*'
        line = 'new line'
        backup = True
        present(module, dest, regexp, None, line, backup)

    def test_present_with_search_string(self):
        module = AnsibleModule()
        dest = '/path/to/file'
        search_string = 'old line'
        line = 'new line'
        backup = True
        present(module, dest, None, search_string, line, backup)

    def test_present_with_backrefs(self):
        module = AnsibleModule()
        dest = '/path/to/file'
        regexp = '.*'
        line = 'new line'
        backup = True
        backrefs = True
        present(module, dest, regexp, None, line, backup, backrefs)

    def test_present_with_insertafter(self):
        module = AnsibleModule()
        dest = '/path/to/file'
        regexp = '.*'
        line = 'new line'
        backup = True
        insertafter = 'EOF'
        present(module, dest, regexp, None, line, backup, None, insertafter)

    def test_present_with_insertbefore(self):
        module = AnsibleModule()
        dest = '/path/to/file'
        regexp = '.*'
        line = 'new line'
        backup = True
        insertbefore = 'BOF'
        present(module, dest, regexp, None, line, backup, None, None, insertbefore)

    def test_present_with_create(self):
        module = AnsibleModule()
        dest = '/path/to/file'
        regexp = '.*'
        line = 'new line'
        backup = True
        create = True
        present(module, dest, regexp, None, line, backup, None, None, None, create)

    def test_present_with_backup(self):
        module = AnsibleModule()
        dest = '/path/to/file'
        regexp = '.*'
        line = 'new line'
        backup = True
        present(module, dest, regexp, None, line, backup)

    def test_present_with_firstmatch(self):
        module = AnsibleModule()
        dest = '/path/to/file'
        regexp = '.*'
        line = 'new line'
        backup = True
        firstmatch = True
        present(module, dest, regexp, None, line, backup, None, None, None, None, firstmatch)

if __name__ == '__main__':
    unittest.main()