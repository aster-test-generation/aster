import unittest
from ansible.modules.systemd import parse_systemctl_show


class TestParseSystemctlShow(unittest.TestCase):
    def test_parse_systemctl_show_single_line(self):
        lines = ["ActiveState=active"]
        result = parse_systemctl_show(lines)
        self.assertEqual(result, {"ActiveState": "active"})

    def test_parse_systemctl_show_multiple_lines(self):
        lines = [
            "ActiveState=active",
            "ExecStart={ path=/usr/sbin/crond ; argv[]=/usr/sbin/crond -n $CRONDARGS ; ignore_errors=no ; start_time=[n/a] ; stop_time=[n/a] ; pid=0 ; code=(null) ; status=0/0 }",
            "ExecMainPID=595"
        ]
        result = parse_systemctl_show(lines)
        self.assertEqual(result, {
            "ActiveState": "active",
            "ExecStart": "{ path=/usr/sbin/crond ; argv[]=/usr/sbin/crond -n $CRONDARGS ; ignore_errors=no ; start_time=[n/a] ; stop_time=[n/a] ; pid=0 ; code=(null) ; status=0/0 }",
            "ExecMainPID": "595"
        })

    def test_parse_systemctl_show_multiline_value(self):
        lines = [
            "ExecStart={ path=/usr/sbin/crond ;",
            "argv[]=/usr/sbin/crond -n $CRONDARGS ;",
            "ignore_errors=no ; start_time=[n/a] ;",
            "stop_time=[n/a] ; pid=0 ; code=(null) ;",
            "status=0/0 }"
        ]
        result = parse_systemctl_show(lines)
        self.assertEqual(result, {
            "ExecStart": "{ path=/usr/sbin/crond ;\nargv[]=/usr/sbin/crond -n $CRONDARGS ;\nignore_errors=no ; start_time=[n/a] ;\nstop_time=[n/a] ; pid=0 ; code=(null) ;\nstatus=0/0 }"
        })

    def test_parse_systemctl_show_empty_lines(self):
        lines = []
        result = parse_systemctl_show(lines)
        self.assertEqual(result, {})

    def test_parse_systemctl_show_no_equals(self):
        lines = ["ActiveState"]
        result = parse_systemctl_show(lines)
        self.assertEqual(result, {})

if __name__ == '__main__':
    unittest.main()